/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BookCategory;

/**
 * @author EX_SKumar
 *
 */
public interface BookCategoryService {

	List<BookCategory> getAllBookCategory();	
	void createBookCategory(BookCategory categoryA, BookCategory categoryB);

}
