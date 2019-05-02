package fi.haagahelia.course.Exercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@ResponseBody

public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
}

	@RequestMapping("/contact")
		public String contact() {
			return "This is the contact page";
	}
	
	@RequestMapping("/hello")
		public String hello(@RequestParam(name="location") String locationValue, @RequestParam(name="name") String nameValue ) {
			return "Welcome to the " + locationValue + " "+ nameValue + "!";
	}
}