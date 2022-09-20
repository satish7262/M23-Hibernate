package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entities.Book;

public class BookDaoImpl implements BookDao
{
	private EntityManager entityManager;

	public BookDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	
	@Override
	public Book getBookById(Integer id) {
		Book b = entityManager.find(Book.class, id);
		return b;
	}

	
	@Override
	public List<Book> getBookByTitle(String title) {
		String qStr = "SELECT b FROM Book b WHERE b.title LIKE :ptitle";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("ptitle", "%"+title+"%");
		return query.getResultList();
	}


	@Override
	public Long getBookCount() {
		String qStr = "SELECT COUNT(b.id) FROM Book b";
		TypedQuery<Long> query = entityManager.createQuery(qStr,
				Long.class);
		Long count = query.getSingleResult();
		return count;
	}

	
	@Override
	public List<Book> getBookByAuthor(String author) {
		String qStr = "SELECT b FROM Book b WHERE b.author=:pAuthor";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("pAuthor", author);
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	
	@Override
	public List<Book> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}
	
	@Override
	public List<Book> getBooksRange(Double low,Double high) {
		String qStr = "SELECT b FROM Book b WHERE b.price between :low and :high";
		TypedQuery<Book> query = entityManager.createQuery(qStr, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		return bookList;
	}



}