package model;

import java.util.ArrayList;

import interfaces.HolidaysCalculations;
import interfaces.SalariesCalculations;

public class Employee extends Member implements SalariesCalculations, HolidaysCalculations {

	public double monthlySalary;
	public ArrayList<Expense> expenses;
	
	

	public Employee() {

	}

	public Employee(String name, String surname, int age, String email, int id, double salary) {

		super(name, surname, age, email, id);

		this.monthlySalary = salary;
		this.expenses = new ArrayList<Expense>();
	}

	public double getSalary() {
		return monthlySalary;
	}

	public void setSalary(double salary) {
		this.monthlySalary = salary;
	}


	@Override
	public String toString() {
		// System.out.println(super.toString());
		return "\nEmployee [salary=" + monthlySalary + "]" + super.toString();
	}

	@Override
	public void calculateYearlySalary() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateTaxes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calcultateHolidays() {
		// TODO Auto-generated method stub

	}

}
