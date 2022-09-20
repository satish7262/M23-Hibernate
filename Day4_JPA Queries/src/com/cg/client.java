package com.cg;

import com.cg.entities.Book;
import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		

		
		System.out.println("Listing total number of books");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("Listing book with id 102");
		System.out.println("Book with ID 104:"+service.getBookById(104));
		
		System.out.println("Listing All books");
		for(Book b:service.getAllBooks()) {
			System.out.println(b);
		}
		
		
		
		System.out.println("Listing book written by Robert Fischer");
		for(Book b:service.getBookByAuthor("Robert Fischer") ) {
			System.out.println(b);
		}
		
		System.out.println("Listing book on Pro Java 8 Programming");
		for(Book b:service.getBookByTitle("Pro Java 8 Programming")) {
			System.out.println(b);
		}
		
		
		
		System.out.println("Listing All books between 300 and 600");
		for(Book b:service.getBooksRange(100.00, 10000.00) ) {
			System.out.println(b);
		}
	}

}