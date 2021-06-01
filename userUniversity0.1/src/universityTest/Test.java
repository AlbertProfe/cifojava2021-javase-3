package universityTest;


import model.Employee;
import model.Member;
import model.Student;
import model.Teacher;
import model.User;
import repostitory.UniversityDB;

public class Test {

	public static void main(String[] args) {

		
	UniversityDB upc_Math_DB = new UniversityDB();
	
	
	UniversityDB KingsCollege_History_DB = new UniversityDB();
	KingsCollege_History_DB.setNameUniversity("Department of History\r\n"
			+ "Faculty of Arts & Humanities, King's College, England");
	
	upc_Math_DB.setLocation("Barcelona");
	upc_Math_DB.setSize(10);
	
	upc_Math_DB.setNameUniversity("Facultat de Matemàtiques i Estadística (FME)\r\n\""
			+ "Universitat Politècnica de Catalunya, Matemàtiques");
	
	UniversityDB.setDefinition("this DBs are all created at AWS infrastructure");
	
	
	//this is Joan, who ask for some information about Maths courses
	User joan = new User();
	joan.setAge(25);
	joan.setEmail("@joan");
	joan.setName("Joan");
	joan.setSurname("Gasol");
	
	System.out.println(joan);
	
	//this is Alexa, a mother who visits her doughter in xmas
	Member alexa = new Member();
	alexa.setAge(26);
	alexa.setEmail("@alexa");
	alexa.setName("Alexa");
	alexa.setSurname("Kazan");
	alexa.setId(101);
	
	System.out.println(alexa);
	

	//this is Sergii, an empoloyee of the university: he handles all the web
	//and the db and spring java systems
	Employee sergii = new Employee();
	sergii.setAge(24);
	sergii.setEmail("@sergeii");
	sergii.setId(102);
	sergii.setSurname("Karmazov");
	sergii.setName("Sergii");
	
	sergii.setSalary(2500.00);
	
	System.out.println(sergii);
	
	//this is pepe, and employee of the university, manages the fiber optics
	//network and systems
	User pepe = new Employee();
	
	
	
	
	//just three students in my campus of Maths
	Student isa = new Student();
	isa.setAge(21);
	isa.setEmail("@isa");
	isa.setId(104);
	isa.setSurname("Debovais");
	isa.setName("Isabel");
	
	isa.setActive(true);
	
	System.out.println(isa);
	
	User borja = new Student();
	
	
	//just a couple of teachers
	Teacher artur = new Teacher();
	artur.setAge(18);
	artur.setEmail("@artur");
	artur.setId(103);
	artur.setSurname("Karmazov");
	artur.setName("Artur");
	artur.setSalary(5000);
	
	artur.setExtraSalaryPerCourse(250);
	
	System.out.println(artur);
	
	User kingsley = new Teacher();
	
	upc_Math_DB.getUniversityUsersDB().add(kingsley);
	
	

	
	//we can't access to this field cause is PRIVATE so well done!!
	//upc_Math_DB.universityUsersDB.add(pepe);
	
	KingsCollege_History_DB.getUniversityUsersDB().add(artur);
		
	}

}
