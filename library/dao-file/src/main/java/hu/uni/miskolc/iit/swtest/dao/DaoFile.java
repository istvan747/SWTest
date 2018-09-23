package hu.uni.miskolc.iit.swtest.dao;

import java.io.File;
import java.util.Collection;

import hu.uni.miskolc.iit.swtest.exceptions.DuplicatedBookEntryException;
import hu.uni.miskolc.iit.swtest.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.swtest.model.Book;

public class DaoFile implements BookDAO{
	
	private File database;
	public static final String FIELD_SEPARATOR = ";";
	
	public DaoFile(String databasePath) {
		super();
		database = new File(databasePath);
	}
	
	public void createBook(Book book) throws DuplicatedBookEntryException {
		Collection<Book> bookList = readBooks();
		
	}

	public Collection<Book> readBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updeateBook(Book book, Book updatedBook) throws EntryNotFoundException {
		// TODO Auto-generated method stub
		
	}

	public void deleteBook(Book book) throws EntryNotFoundException {
		// TODO Auto-generated method stub
		
	}

	public void setBookRented(Book book, boolean rented) throws EntryNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
