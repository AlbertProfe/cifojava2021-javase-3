package example.boot.dev.employee1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/allEmployees")
	public String getAllEmployees(Model boxToView) {
		
		
		//System.out.println(employeeRepository.findAll());
		boxToView.addAttribute("employeeListfromControllerAndDB", employeeRepository.findAll() );
		//boxToView.addAttribute("message", "hi from NORWAY");
		//boxToView.addAttribute("smoker", true);
		//boxToView.addAttribute("taxesIVA", 21.00);
		
		
		return "employees.html";
	}

}
