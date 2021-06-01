package model;

import java.util.List;

import interfaces.CredentialsCalculations;
import interfaces.HolidaysCalculations;

public class Member extends User implements CredentialsCalculations, HolidaysCalculations {
	
	private int id;
	
	private List<Holidays> holidays;
	private Credentials credentials;
	
	public Member() {super();}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Holidays> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holidays> holidays) {
		this.holidays = holidays;
	}


	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}


	@Override
	public void managmentCredentials() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void calcultateHolidays() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		
		//System.out.println(super.toString());
		return  "\nMember [id=" + id + ", holidays=" + holidays + ", credentials=" + credentials + "]" + super.toString();
	}
	
	

}
