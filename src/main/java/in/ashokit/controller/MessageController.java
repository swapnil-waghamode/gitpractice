package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {

		model.addAttribute("msg", "Welcome To Thymeleaf App");

		return "index";
	}

	// bug 124

	@GetMapping("/hello")
	public String getWelcomeMsg(Model model) {

		model.addAttribute("msg", "Welcome T");

		return "index";
	}


	@GetMapping("/greet")
	public String getGreetMsg(Model model) {

		model.addAttribute("msg", "Hello Good Morning!");
		return "index";
	}
}
