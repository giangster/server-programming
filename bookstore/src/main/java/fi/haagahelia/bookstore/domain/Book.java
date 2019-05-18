package fi.haagahelia.bookstore.domain;

public class Book {
	String title;
	String author;
	int year;
	String isbn;
	double price;
	
	public Book(String title, String author, int year, String isbn, double price) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}
}
