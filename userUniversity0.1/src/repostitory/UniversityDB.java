package repostitory;

import java.util.ArrayList;
import java.util.List;
import model.User;

public class UniversityDB {
		
	
	private static String definition;
	private static int DBsTotal;
	
	private int usersQty;
	private String nameUniversity;
	private String location;
	private int size;
	public List<User> users;
	
	
	public UniversityDB() {
		super();
		this.users = new ArrayList<User>();
	}


	public UniversityDB(String location, int size) {
		super();
		this.location = location;
		this.size = size;
		this.users = new ArrayList<User>();
	}
	
	
	public static int getDBsTotal() {
		return DBsTotal;
	}

	public static void setDBsTotal(int dBsTotal) {
		DBsTotal = dBsTotal;
	}

	public int getUsersQty() {
		return usersQty;
	}
	
	public void setUsersQty(int usersQty) {
		this.usersQty = usersQty;
	}

	public static String getDefinition() {
		return definition;
	}

	public static void setDefinition(String definition) {
		UniversityDB.definition = definition;
	}

	public  String getNameUniversity() {
		return nameUniversity;
	}
	
	public void setNameUniversity(String nameUniversity) {
		this.nameUniversity = nameUniversity;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public List<User> getUniversityUsersDB() {
		return users;
	}
	
	public void setUniversityUsersDB(List<User> universityUsersDB) {
		this.users = universityUsersDB;
	}


	@Override
	public String toString() {
		return "UniversityDB [nameUniversity=" + nameUniversity + ", location=" + location
				+ ", size=" + size + "\nusers=" + users + "]";
	}

}
