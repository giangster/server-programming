package fi.haagahelia.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.bookstore.domain.Book;
import fi.haagahelia.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
	return (args) -> {
		Book book1 = new Book("Homo Sapiens", "Yuval Noah Harari", "NFB1", 2015, 15.50);
		Book book2 = new Book("Homo Deus", "Yuval Noah Harari", "NFB2", 2017, 17.00);
		Book book3 = new Book("Where rainbows end", "Cecelia Ahern", "FB1", 2003, 10.25);
		Book book4 = new Book("1Q84", "Haruki Murakami", "FB2", 2007, 21.50);
		Book book5 = new Book("Mindset", "Carol S. Dweck", "NFB3", 2014, 12.00);
		Book book6 = new Book("Detective Conan", "Gosho Aoyama", "FB3", 2000, 15.50);

		repository.save(book1);
		repository.save(book2);
		repository.save(book3);
		repository.save(book4);
		repository.save(book5);
		repository.save(book6);
		
		
	};
	}
	
}
