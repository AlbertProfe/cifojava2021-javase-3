package example.boot.dev.employee1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private double value;
	
		
	public Expense() {
		super();
	}
	public Expense(int id, String name, double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
	@Override
	public String toString() {
		return "Expense [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
	
	
	
	
	
	

}
