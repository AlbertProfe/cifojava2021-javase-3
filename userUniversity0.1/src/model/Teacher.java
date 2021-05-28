package model;

import interfaces.Holidays;

public class Teacher extends Employee implements Holidays {
	
	public double extraSalaryPerCourse;

	public Teacher() {
		
	
	}

	public double getExtraSalaryPerCourse() {
		return extraSalaryPerCourse;
	}

	public void setExtraSalaryPerCourse(double extraSalaryPerCourse) {
		this.extraSalaryPerCourse = extraSalaryPerCourse;
	}

	@Override
	public String toString() {
		
			
		return super.toString()	 + "\nTeacher [extraSalaryPerCourse=" + extraSalaryPerCourse + "]";
	}
	
	
	
	
	

}
