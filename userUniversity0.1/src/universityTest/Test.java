package universityTest;

import java.util.Collections;

import model.Employee;
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
	
	//this is Alexa, a mother who visits her doughter in xmas
	User alexa = new User();
	
	
	//this is Sergii, an empoloyee of the university: he handles all the web
	//and the db and spring java systems
	User sergii = new Employee();
	
	//this is pepe, and employee of the university, manages the fiber optics
	//network and systems
	User pepe = new Employee();
	
	//just three students in my campus of Maths
	User isa = new Student();
	User borja = new Student();
	User dimitry = new Student();
	
	//just a couple of teachers
	User artur = new Teacher();
	User kingsley = new Teacher();
	
	upc_Math_DB.getUniversityUsersDB().add(kingsley);
	
	

	
	//we can't access to this field cause is PRIVATE so well done!!
	//upc_Math_DB.universityUsersDB.add(pepe);
	
	KingsCollege_History_DB.getUniversityUsersDB().add(artur);
		
	}

}
