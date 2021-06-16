package example.boot.dev.employee1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/*")
	public String notFound (Model model) {
		
		String pattern = "yyyy-MM-dd HH:mm:ssZ";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		model.addAttribute("serverTime", simpleDateFormat.format(new Date()));
		
		return "notFound";
	}
	
	@RequestMapping("/allEmployees")
	public String getAllEmployees(Model boxToView) {
		
		
		//System.out.println(employeeRepository.findAll());
		boxToView.addAttribute("employeeListfromControllerAndDB", employeeRepository.findAll() );
		//boxToView.addAttribute("message", "hi from NORWAY");
		//boxToView.addAttribute("smoker", true);
		//boxToView.addAttribute("taxesIVA", 21.00);
	
		return "employees";
	}
	
	@RequestMapping("/deleteEmployee")
	public String removeEmployee(int id, Model model) {
		
		//System.out.println("inside removeEmployee" + id);
		Optional<Employee> employeeFound = findOneEmployeeById(id);
		
		//System.out.println("find inside removeEmployee" + employeeFound.get());
		
		if (employeeFound.isPresent()) {
			
			employeeRepository.deleteById(id);
			model.addAttribute("message", "deleted employee confirmation");
			model.addAttribute( "employeeDeleted", employeeFound.get());
		}
		
		else {
			model.addAttribute("message", "deleted employee error, maybe there is no id .... or network connection ..");
		}
		
		//System.out.println("finishing removeEmployee" + id);
		return "deletedemployee.html";
	}
	
	public Optional<Employee> findOneEmployeeById(int id) {
		
		//System.out.println("inside findEmployee" + id);
		Optional<Employee> employeeFound = employeeRepository.findById(id);
		//System.out.println("finishing findEmployee" + id);
		//System.out.println("finishing findEmployee" + employeeFound.get());
		return employeeFound;
	}

	
	@RequestMapping("/newEmployee")
	public String newEmpoyee() {

		return "newemployee";
	}

	@RequestMapping("/addEmployee")
	public String inserEmployee(Employee employee, Model model) {

		employeeRepository.save(employee);

		return "redirect:/employee/allEmployees";
	}
}
