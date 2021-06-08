package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Holidays {

	private int year;
	private List<Date> daysHolidays;
	private int daysHolidaysQty;
		
	public Holidays(int year) {
		super();
		this.year = year;
		this.daysHolidaysQty = 0;
		this.daysHolidays = new ArrayList<Date>();
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public List<Date> getDaysHolidays() {
		return daysHolidays;
	}
	
	public void addHolidays(Date dateToAdd) {
		this.getDaysHolidays().add(dateToAdd);
		this.setDaysHolidaysQty();
	}
	public int getDaysHolidaysQty() {
		return daysHolidaysQty;
	}
	public void setDaysHolidaysQty() {
		this.daysHolidaysQty = this.getDaysHolidays().size();
	}

	
}
