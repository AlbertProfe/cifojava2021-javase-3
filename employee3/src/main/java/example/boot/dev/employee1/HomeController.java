package example.boot.dev.employee1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {	
	
	@RequestMapping("/home")
	public String home () {
		return "home";
	}
	
	@RequestMapping("/topics")
	public String todoTopics () {
		return "topics";
	}
	
	@RequestMapping({"*", "employee/*"})
	public String notFound (Model model) {
		
		
		String pattern = "yyyy-MM-dd HH:mm:ssZ";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		model.addAttribute("serverTime", simpleDateFormat.format(new Date()));
		
		return "notFound";
	}
		


}
