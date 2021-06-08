package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.CredentialsCalculations;
import interfaces.HolidaysCalculations;

public class Member extends User implements CredentialsCalculations, HolidaysCalculations {

	private int id;

	private List<Holidays> holidays;
	private Credentials credentials;

	public Member() {
		super();
	}

	public Member(String name, String surname, int age, String email, int id) {

		super(name, surname, age, email);

		this.id = id;
		this.holidays = new ArrayList<Holidays>();

	}

	public Member(int id) {

		this.id = id;
		this.holidays = new ArrayList<Holidays>();

	}

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
	public double calcultateHolidays(int year) {


		return 0.0;

	}

	@Override
	public String toString() {

		// System.out.println(super.toString());
		return "\nMember [id=" + id + ", holidays=" + holidays + ", credentials=" + credentials + "]"
				+ super.toString();
	}

	

}
