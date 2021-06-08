package model;

public class User {

	public String name;
	public String surname;
	public int age;
	public String email;

	public User() {
	}

	public User(String name, String surname, int age, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {

		return "\nUser [name=" + name + ", surname=" + surname + ", age=" + age + ", email=" + email + "]";
	}

}
