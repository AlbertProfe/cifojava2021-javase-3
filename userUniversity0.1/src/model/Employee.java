package model;

import java.util.ArrayList;

import interfaces.HolidaysCalculations;
import interfaces.SalariesCalculations;

public class Employee extends Member implements SalariesCalculations, HolidaysCalculations {

	public double salary;
	public ArrayList<Expense> expenses;

	public Employee() {

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		//System.out.println(super.toString());
		return  "\nEmployee [salary=" + salary + "]" + super.toString();
	}

	@Override
	public void calculateSalary() {
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
