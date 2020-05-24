/**
 * 
 */
package com.example.demo.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookCategory;
import com.example.demo.repository.BookCategoryRepository;
import com.example.demo.service.BookCategoryService;

/**
 * @author EX_SKumar
 *
 */
@Service
public class BookCategoryServiceImpl implements BookCategoryService {

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Override
	public List<BookCategory> getAllBookCategory() {
		// TODO Auto-generated method stub
		return bookCategoryRepository.findAll();
	}

	@Override
	public void createBookCategory(BookCategory categoryA, BookCategory categoryB) {
		// TODO Auto-generated method stub		
		 bookCategoryRepository.save(Arrays.asList(categoryA, categoryB));
	}

}
