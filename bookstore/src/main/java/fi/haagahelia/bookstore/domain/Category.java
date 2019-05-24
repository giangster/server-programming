package fi.haagahelia.bookstore.domain;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long categoryId;
	String name;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "category")
	private List<Book> books;
	
	public Category() {}

	public Category(Long categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setcategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
