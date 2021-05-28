package model;

import java.util.Date;
import java.util.HashMap;

import interfaces.Holidays;

public class Student extends User implements Holidays {

	public HashMap<String, Double> marks;
	public boolean active;
	public Date inscriptionDate;

	public Student() {
		
		
	}

	public HashMap<String, Double> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<String, Double> marks) {
		this.marks = marks;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getInscriptionDate() {
		return inscriptionDate;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}

	@Override
	public String toString() {
	
		return "Student [marks=" + marks + ", active=" + active + ", inscriptionDate=" + inscriptionDate +  "]";
	}

	@Override
	public void calcultateHolidays() {
		// TODO Auto-generated method stub
		
	}

}
