package example.boot.dev.employee1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Random;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.javafaker.Faker;

@Controller
public class HomeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping({ "/home", "/" })
	public String home() {
		return "home";
	}

	@RequestMapping("/topics")
	public String todoTopics() {
		return "topics";
	}

	@RequestMapping({ "/fillin" })
	public String finInDB() {

		return "fillinemployee";
	}

	@RequestMapping({ "/fillinemployee" })
	public String fillInDBEmployee(int qtyToCreate) {

		String alphabetChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/+/";

		// int i = 0;
		char stringRandom1, stringRandom2, stringRandom3;
		/*
		 * while (i < 10) { char charRandom =
		 * alphabetChars.charAt(createIntRandom(alphabetChars.length())); stringRandom *
		 * += stringRandom + charRandom;
		 * 
		 * }
		 */

		Faker faker = new Faker();
		Random rand = new Random();
		int max = 1525;
		int count = 1;

		while (count < qtyToCreate) {

			stringRandom1 = alphabetChars.charAt(createIntRandom(alphabetChars.length()));
			stringRandom2 = alphabetChars.charAt(createIntRandom(alphabetChars.length()));
			stringRandom3 = alphabetChars.charAt(createIntRandom(alphabetChars.length()));
			int intRandom = rand.nextInt(max);

			/*
			 * boolean randomPublished; if ((intRandom % 2) == 0) { randomPublished = true;
			 * } else { randomPublished = false; }
			 */

			employeeRepository.save(new Employee(faker.name().firstName(), faker.name().lastName(),
					faker.number().numberBetween(18, 80), faker.name().firstName() + "@java.com",
					faker.number().randomDouble(2, 5, 2000),
					String.valueOf((intRandom + 5) * count * 6) + stringRandom1 + stringRandom2 + stringRandom3));

			count++;
		}

		return "redirect:/employee/allEmployees";
	}

	public static int createIntRandom(int top) {

		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		int intRandom = rand.nextInt(top);
		return intRandom;

	}

	@RequestMapping({ "*", "*/*" })
	public String notFound(Model model) {

		String pattern = "yyyy-MM-dd HH:mm:ssZ";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		model.addAttribute("serverTime", simpleDateFormat.format(new Date()));

		return "notFound";
	}

}
