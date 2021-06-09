package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import interfaces.HolidaysCalculations;
import interfaces.SalariesCalculations;

public class Employee extends Member implements SalariesCalculations, HolidaysCalculations {

	public double monthSalary;

	public ArrayList<Expense> expenses;
	public List<Holidays> holidaysList;

	public HashMap<Integer, Double> salaryPerYear;

	public Employee() {
		this.expenses = new ArrayList<Expense>();
		this.salaryPerYear = new HashMap<Integer, Double>();
		this.holidaysList = new ArrayList<Holidays>();
	}

	public Employee(String name, String surname, int age, String email, int id, double salary) {

		super(name, surname, age, email, id);

		this.monthSalary = salary;
		this.expenses = new ArrayList<Expense>();
		this.salaryPerYear = new HashMap<Integer, Double>();
		this.holidaysList = new ArrayList<Holidays>();
	}

	// ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	public HashMap<Integer, Double> getSalaryPerYear() {

		// to do for each calculate each year
		// this.calculateYearlySalary();
		return salaryPerYear;
	}

	public HashMap<Integer, Double> getSalaryPerYear(int year) {

		this.calculateYearlySalary(year);
		return salaryPerYear;
	}
	

	public List<Holidays> getHolidaysList() {
		return holidaysList;
	}

	public void setHolidaysList(List<Holidays> holidaysList) {
		this.holidaysList = holidaysList;
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

	public ArrayList<Expense> getExpenses() {
		return expenses;
	}

	// ------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------
	@Override
	public void calculateYearlySalary(int year) {

		double yearSalary = 0.0;
		double yearExpenses = this.calculateExpensesPerYear(year);
		double yearTaxes = this.calculateTaxes(year);
		double yearHolidays = this.calcultateHolidays(year);
							
		yearSalary = yearTaxes  + yearExpenses + yearHolidays;

		System.out.println("\n" + this 
				+ " \nyear: " + year 
				+ " \nyearExpenses: " + yearExpenses
				+ " \nyearTaxes: " + yearTaxes
				+ " \nyearHolidays: " + yearHolidays
				+ " \nyearSalary: " + yearSalary);
		
		
		this.getSalaryPerYear().put(year, yearSalary);
	}

	public double calculateExpensesPerYear(int year) {

		
		
		double totalExpensesPerYear = 0.0;
		
		for (Expense expense : this.getExpenses()) {
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(expense.getDate());
		
			
			// https://stackoverflow.com/questions/9243578/java-util-date-and-getyear
			
			System.out.println("Expense name: "  + expense.getName()
					 + " Expense value: " + expense.getValue()
					 +  " Expense date (bad): " + expense.getDate().getYear()
					 + " Expense date (good): " + 	calendar.get(Calendar.YEAR));
			
		
			
			if ((expense.getValue() > 0) && (calendar.get(Calendar.YEAR) == year)) {

				totalExpensesPerYear = totalExpensesPerYear + (expense.getValue());
				System.out.println("Expenses calculate loop: " + totalExpensesPerYear);
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
		double totalSalary = monthSalary * 14; // 14 son pagas en año

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

		double totalHoolidaysValuepPerYear = 0.0;
		int holidaysPerYearOfficial = 25;
		double salaryPerDay = this.monthSalary / 22;

		for (Holidays holidays : this.getHolidaysList()) {

			if (holidays.getYear() == year) {

				int differenceDays = holidays.getDaysHolidaysQty() - holidaysPerYearOfficial;
				totalHoolidaysValuepPerYear = differenceDays * salaryPerDay;

				if (differenceDays < 0) {

					totalHoolidaysValuepPerYear = -(totalHoolidaysValuepPerYear);
				}
				break;
			}

		}

		return totalHoolidaysValuepPerYear;
	}

	// ----------------------------------------------------------------------------------
	@Override
	public String toString() {
		// System.out.println(super.toString());
		return "\nEmployee [salary=" + monthSalary + "]" + super.toString();
	}

}
