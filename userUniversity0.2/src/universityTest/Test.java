package universityTest;

import model.Employee;
import model.Member;
import model.Student;
import model.Teacher;
import model.User;
import repostitory.UniversityDB;

public class Test {

	public static void main(String[] args) {

		// testObjects();
		//testUsers();
		testSalaries();

		System.out.println(" finishing ....");

	}

	public static void testObjects() {

		// this is Joan, who ask for some information about Maths courses
		User joan = new User();
		joan.setAge(25);
		joan.setEmail("@joan");
		joan.setName("Joan");
		joan.setSurname("Gasol");

		System.out.println(joan);

		// this is Alexa, a mother who visits her doughter in xmas
		Member alexa = new Member();
		alexa.setAge(26);
		alexa.setEmail("@alexa");
		alexa.setName("Alexa");
		alexa.setSurname("Kazan");
		alexa.setId(101);

		System.out.println(alexa);

		// this is Sergii, an empoloyee of the university: he handles all the web
		// and the db and spring java systems
		Employee sergii = new Employee();
		sergii.setAge(24);
		sergii.setEmail("@sergeii");
		sergii.setId(102);
		sergii.setSurname("Karmazov");
		sergii.setName("Sergii");

		sergii.setSalary(2500.00);

		System.out.println(sergii);

		// this is pepe, and employee of the university, manages the fiber optics
		// network and systems
		User pepeOriginal = new Employee();

		// we cant set the salary cause in compilation time var-ref pepe, that is TAG,
		// dont see setSalary
		// pepeOriginal.setSalary(8000);

		User pepeClone = new Employee("Pepe", "Ropsten", 25, "@pepe", 105, 50000);

		System.out.println("\nLet's see if pepeClone in execution time prints (with toString) the toString"
				+ "\nof Employee (cause NEW is Employee) or User (cause TAG is User)"
				+ "\nconsidering that TAG is User (so in compilation time it will execute JUST its methods)"
				+ "\nwill not have access to subclasses methods and fields.");
		System.out.println(pepeClone);

		User pepeMember = new Member(106);

		// just three students in my campus of Maths
		Student isa = new Student();
		isa.setAge(21);
		isa.setEmail("@isa");
		isa.setId(104);
		isa.setSurname("Debovais");
		isa.setName("Isabel");

		isa.setActive(true);

		System.out.println(isa);

		User borja = new Student();

		// just a couple of teachers
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

	}

	public static void testUsers() {

		UniversityDB upc_Math_DB = new UniversityDB();

		UniversityDB KingsCollege_History_DB = new UniversityDB();
		KingsCollege_History_DB.setNameUniversity(
				"Department of History\r\n" + "Faculty of Arts & Humanities, King's College, England");

		upc_Math_DB.setLocation("Barcelona");
		upc_Math_DB.setSize(10);

		upc_Math_DB.setNameUniversity("Facultat de Matemàtiques i Estadística (FME)\r\n\""
				+ "Universitat Politècnica de Catalunya, Matemàtiques");

		UniversityDB.setDefinition("this DBs are all created at AWS infrastructure");

		// this is Joan, who ask for some information about Maths courses
		User joan = new User();
		joan.setAge(25);
		joan.setEmail("@joan");
		joan.setName("Joan");
		joan.setSurname("Gasol");

		// System.out.println(joan);

		// this is Alexa, a mother who visits her doughter in xmas
		Member alexa = new Member();
		alexa.setAge(26);
		alexa.setEmail("@alexa");
		alexa.setName("Alexa");
		alexa.setSurname("Kazan");
		alexa.setId(101);

		// System.out.println(alexa);

		// this is Sergii, an empoloyee of the university: he handles all the web
		// and the db and spring java systems
		Employee sergii = new Employee();
		sergii.setAge(24);
		sergii.setEmail("@sergeii");
		sergii.setId(102);
		sergii.setSurname("Karmazov");
		sergii.setName("Sergii");

		sergii.setSalary(2500.00);

		// System.out.println(sergii);

		// this is pepe, and employee of the university, manages the fiber optics
		// network and systems
		User pepeOriginal = new Employee();

		// we cant set the salary cause in compilation time var-ref pepe, that is TAG,
		// dont see setSalary
		// pepeOriginal.setSalary(8000);

		User pepeClone = new Employee("Pepe", "Ropsten", 25, "@pepe", 105, 50000);

		System.out.println("\nLet's see if pepeClone in execution time prints (with toString)"
				+ "\nthe toString of Employee (cause NEW is Employye) or User (cause TAG is User),"
				+ "\nconsidering that TAG is User (so in compilation time it will execute JUST its methods)"
				+ "\nwill not have access to subclasses methods and fields."
				+ "So \"System.out.println(pepeClone);\" will execute Employee's toString.");
		System.out.println(pepeClone);

		User pepeMember = new Member(106);

		// just three students in my campus of Maths
		Student isa = new Student();
		isa.setAge(21);
		isa.setEmail("@isa");
		isa.setId(104);
		isa.setSurname("Debovais");
		isa.setName("Isabel");

		isa.setActive(true);

		// System.out.println(isa);

		User borja = new Student();

		// just a couple of teachers
		Teacher artur = new Teacher();
		artur.setAge(18);
		artur.setEmail("@artur");
		artur.setId(103);
		artur.setSurname("Karmazov");
		artur.setName("Artur");
		artur.setSalary(5000);

		artur.setExtraSalaryPerCourse(250);

		// System.out.println(artur);

		User kingsley = new Teacher();

		upc_Math_DB.getUniversityUsersDB().add(kingsley);
		upc_Math_DB.getUniversityUsersDB().add(joan);
		upc_Math_DB.getUniversityUsersDB().add(alexa);
		upc_Math_DB.getUniversityUsersDB().add(sergii);
		upc_Math_DB.getUniversityUsersDB().add(pepeOriginal);
		upc_Math_DB.getUniversityUsersDB().add(pepeClone);
		upc_Math_DB.getUniversityUsersDB().add(pepeMember);
		upc_Math_DB.getUniversityUsersDB().add(isa);
		upc_Math_DB.getUniversityUsersDB().add(artur);

		System.out.println("\nFacultat de Matemàtiques i Estadística (FME)");
		System.out.println("----------------------------------------------");
		// System.out.println(upc_Math_DB);

		upc_Math_DB.printUsers();

		// we can't access to this field cause is PRIVATE so well done!!
		// upc_Math_DB.universityUsersDB.add(pepe);

		KingsCollege_History_DB.getUniversityUsersDB().add(artur);

	}
	
	public static void testSalaries () {
		
		Teacher artur = new Teacher();
		artur.setAge(18);
		artur.setEmail("@artur");
		artur.setId(103);
		artur.setSurname("Karmazov");
		artur.setName("Artur");
		artur.setSalary(5000);
		
		artur.getSalaryPerYear().get(2021);
		
		Student pepe = new Student();
		Teacher king = new Teacher();
		
		
		
	}

}
