package fi.haagahelia.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;


@Controller
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@RequestMapping(value = "/booklist")
	public String book(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist";
	}
	
	@RequestMapping(value = "/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		return "addbook.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook(Book book) {
		repository.save(book);
		return "redirect:booklist";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
	public String saveEdittedBook(Book book) {
		repository.save(book);
		return "redirect:../booklist";
	}
	
	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
	public String getBookById(@PathVariable ("id") Long bookId, Model model) {
		Book book = repository.findById(bookId)
			      .orElseThrow(() -> new IllegalArgumentException("Invalid book" + bookId));
		model.addAttribute("book", book);
		return "editbook.html";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable ("id") Long bookId, Model model) {
		repository.deleteById(bookId);
		return "redirect:../booklist";
	}
}
