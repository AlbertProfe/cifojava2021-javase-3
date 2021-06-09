package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import interfaces.HolidaysCalculations;
import interfaces.SalariesCalculations;

public class Employee extends Member implements SalariesCalculations, HolidaysCalculations {

	public double monthSalary;
	public ArrayList<Expense> expenses;
	public List<Holidays> holidaysList;
	public HashMap<Integer, Double> salaryPerYear;
	

	public Employee() {	}

	public Employee(String name, String surname, int age, String email, int id, double salary) {

		super(name, surname, age, email, id);

		this.monthSalary = salary;
		this.expenses = new ArrayList<Expense>();
	}

	public HashMap<Integer, Double> getSalaryPerYear() {

		//to do for each calculate each year
		//this.calculateYearlySalary();
		return salaryPerYear;
	}

	public HashMap<Integer, Double> getSalaryPerYear(int year) {

		this.calculateYearlySalary(year);
		return salaryPerYear;
	}

	public void setSalaryPerYear(HashMap<Integer, Double> salaryPerYear) {
		this.salaryPerYear = salaryPerYear;
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

	@Override
	public void calculateYearlySalary(int year) {

		double yearSalary = this.calculateTaxes(year) + this.calculateExpensesPerYear(year);
		

		this.salaryPerYear.put(year, yearSalary);
	}
	
	public double calculateExpensesPerYear(int year) {

		double totalExpensesPerYear = 0.0;
		for (Expense expense : expenses) {
			//https://stackoverflow.com/questions/9243578/java-util-date-and-getyear
			if ((expense.getValue() > 0) && (expense.getDate().getYear() == year)) {

				totalExpensesPerYear = totalExpensesPerYear + (expense.getValue());
			}
		}

		return totalExpensesPerYear;

	}

	@Override
	public double calculateTaxes(int year) { 
		
		// impostos a pagar.
		// int year = Expense.getDate().getYear();
		double taxe1 = 2.0; // public double section1 = minimum;
		double taxe2 = 4.0;
		double taxe3 = 10.0;
		double taxe4 = 25.0;
		double totalSalary = monthSalary * 14; // 14 son pagas en aÃ±o

		if (totalSalary <= 12600) {
			totalSalary = (totalSalary * (100 - taxe1));

		} else if (totalSalary <= 15000) {
			totalSalary = (totalSalary * (100 - taxe2));

		} else if (totalSalary <= 21000) {
			totalSalary = (totalSalary * (100 - taxe3));

		} else if (totalSalary > 21000) {
			totalSalary = (totalSalary * (100 - taxe4));

		} else
			totalSalary = -1;

		return totalSalary;
	}

	@Override
	public double calcultateHolidays(int year) {


		return 0.0;
	}

	@Override
	public String toString() {
		// System.out.println(super.toString());
		return "\nEmployee [salary=" + monthSalary + "]" + super.toString();
	}

	

}
