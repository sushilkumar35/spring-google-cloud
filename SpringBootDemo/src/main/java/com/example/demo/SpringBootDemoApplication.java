package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Book;
import com.example.demo.model.BookCategory;
import com.example.demo.service.BookCategoryService;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger("LOGGER");

	@Autowired
	private BookCategoryService bookCategoryService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... strings) throws Exception {
		// save a couple of categories
		final BookCategory categoryA = new BookCategory("Category A");
		Set<Book> bookAs = new HashSet<>();
		bookAs.add(new Book("Book A1", categoryA));
		bookAs.add(new Book("Book A2", categoryA));
		bookAs.add(new Book("Book A3", categoryA));
		categoryA.setBooks(bookAs);

		final BookCategory categoryB = new BookCategory("Category B");
		Set<Book> bookBs = new HashSet<>();
		bookBs.add(new Book("Book B1", categoryB));
		bookBs.add(new Book("Book B2", categoryB));
		bookBs.add(new Book("Book B3", categoryB));
		categoryB.setBooks(bookBs);

		bookCategoryService.createBookCategory(categoryA, categoryB);

		List<BookCategory> bookCategory = bookCategoryService.getAllBookCategory();
		LOG.info("Book Category Size ************  : {}", bookCategory.size());
		for (BookCategory b : bookCategory) {

			LOG.info("BookCategory ID ************ : {} ", b.getId());
			LOG.info("BookCategory NAME ***********: {} ", b.getName());

			for (Book book : b.getBooks()) {

				LOG.info("Book Id************: {} ", book.getId());
				LOG.info("Book Name ************: {} ", book.getName());
			}

		}

	}

}
