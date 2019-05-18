package fi.haagahelia.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.bookstore.domain.Book;


@Controller
public class BookController {
	@RequestMapping("/index")
	public String book(Model model) {
		System.out.println("graooooo");
		return "page";
	}
}
