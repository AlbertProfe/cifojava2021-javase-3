package model;

import interfaces.HolidaysCalculations;

public class Teacher extends Employee implements HolidaysCalculations {
	
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
