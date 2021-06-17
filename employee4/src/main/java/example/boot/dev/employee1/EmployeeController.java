package example.boot.dev.employee1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping("/allEmployees")
	public String getAllEmployees(Model boxToView) {

		// System.out.println(employeeRepository.findAll());
		boxToView.addAttribute("employeeListfromControllerAndDB", employeeRepository.findAll());
		// boxToView.addAttribute("message", "hi from NORWAY");
		// boxToView.addAttribute("smoker", true);
		// boxToView.addAttribute("taxesIVA", 21.00);

		return "employees";
	}

	@RequestMapping("/deleteEmployee")
	public String removeEmployee(int id, Model model) {

		// System.out.println("inside removeEmployee" + id);
		Optional<Employee> employeeFound = findOneEmployeeById(id);

		// System.out.println("find inside removeEmployee" + employeeFound.get());

		if (employeeFound.isPresent()) {

			employeeRepository.deleteById(id);
			model.addAttribute("message", "deleted employee confirmation");
			model.addAttribute("employeeDeleted", employeeFound.get());
		}

		else {
			model.addAttribute("message", "deleted employee error, maybe there is no id .... or network connection ..");
		}

		// System.out.println("finishing removeEmployee" + id);
		return "deletedemployee.html";
	}

	@RequestMapping("/newEmployee")
	public String newEmpoyee() {

		return "newemployee.html";
	}

	@RequestMapping("/addEmployee")
	public String inserEmployee(Employee employee) {

		employeeRepository.save(employee);

		return "redirect:/employee/allEmployees";
	}

	@RequestMapping("/updateEmployee")
	public String updateEmpoyee(int id, Model model) {

		Optional<Employee> employeeFound = findOneEmployeeById(id);

		if (employeeFound.isPresent()) {

			model.addAttribute("employeefromController", employeeFound.get());
			return "updateemployee";
		}

		else
			return "notfound.html";
	}

	@PostMapping("/replaceEmployee/{idFromView}")
	public String replaceEmployee(@PathVariable("idFromView") int id, Employee employee) {

		Optional<Employee> employeeFound = findOneEmployeeById(id);

		if (employeeFound.isPresent()) {

			if (employee.getName() != null)
				employeeFound.get().setName(employee.getName());
			if (employee.getSurname() != null)
				employeeFound.get().setSurname(employee.getSurname());
			if (employee.getPassword() != null)
				employeeFound.get().setPassword(employee.getPassword());
			if (employee.getEmail() != null)
				employeeFound.get().setEmail(employee.getEmail());
			if (employee.getAge() != 0)
				employeeFound.get().setAge(employee.getAge());
			if (employee.getMonthSalary() != 0.0)
				employeeFound.get().setMonthSalary(employee.getMonthSalary());

			employeeRepository.save(employeeFound.get());
			return "redirect:/employee/allEmployees";

		} else
			return "notfound.html";

	}
	
	@RequestMapping("/deleteAllEmployees")
	public String deleteaAllEmployees () {

		
		 employeeRepository.deleteAll();
		

		return "redirect:/employee/allEmployees";

	}

//--------------------------------------------------------------------------------
//------------------------- service to controller --------------------------------
//--------------------------------------------------------------------------------

	public Optional<Employee> findOneEmployeeById(int id) {

		// System.out.println("inside findEmployee" + id);
		Optional<Employee> employeeFound = employeeRepository.findById(id);
		// System.out.println("finishing findEmployee" + id);
		// System.out.println("finishing findEmployee" + employeeFound.get());
		return employeeFound;
	}

}
