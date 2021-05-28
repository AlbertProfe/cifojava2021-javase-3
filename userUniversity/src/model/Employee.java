package model;

public class Employee extends User implements SalariesCalculations, Holidays {
	
	public double salary;
		
	public Employee(String name, String surname, int age,
			double salary) {
		
		super(name, surname, age);
		
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return super.toString() + "\nEmployee [salary=" + salary + "]";
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
