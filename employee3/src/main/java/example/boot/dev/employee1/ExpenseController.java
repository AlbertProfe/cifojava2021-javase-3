package example.boot.dev.employee1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	@RequestMapping("/expense")
	public class ExpenseController {
		
		@Autowired
		ExpenseRepository expenseRepository;

		@RequestMapping("/allExpenses")
		public String getAllEmployees(Model boxToView) {
			
			boxToView.addAttribute("expensesfromController", expenseRepository.findAll() );
			
			return "expenses.html";
		}

}
