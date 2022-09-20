package com.cg.service;

import java.util.List;

import com.cg.entities.Book;

public interface BookService 
{
	    //abstract method by default
		public abstract Book getBookById(Integer id);
		public abstract List<Book> getBookByTitle(String title);
		public abstract Long getBookCount();
		public abstract List<Book> getBookByAuthor(String author);
		public abstract List<Book> getAllBooks();
		public abstract List<Book> getBooksRange(Double low , Double high);

}
