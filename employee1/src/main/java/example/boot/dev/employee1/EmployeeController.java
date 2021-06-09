package example.boot.dev.employee1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/allEmployees")
	public String getAllEmployees() {
		
		
		System.out.println(employeeRepository.findAll());
		
		
		return "employees";
	}

}
