package hu.uni.miskolc.iit.swtest.service;

import java.util.Collection;

import hu.uni.miskolc.iit.swtest.dao.BookDAO;
import hu.uni.miskolc.iit.swtest.exceptions.BookAlreadyExistsException;
import hu.uni.miskolc.iit.swtest.exceptions.BookDoesNotExistsException;
import hu.uni.miskolc.iit.swtest.exceptions.DuplicatedBookEntryException;
import hu.uni.miskolc.iit.swtest.model.Book;

public class BookManagerServiceImpl implements BookManagerService{

	private BookDAO bookDAO;
	
	public BookManagerServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}
	
	public void recordBook(Book book) throws BookAlreadyExistsException {
		try {
			bookDAO.createBook(book);
		} catch (DuplicatedBookEntryException e) {
			throw new BookAlreadyExistsException(e);
		}		
	}

	public void updateBook(int bookId, Book updatedBook) throws BookDoesNotExistsException {
				
	}

	public void setBookRented(Book book) throws BookDoesNotExistsException {
		// TODO Auto-generated method stub
		
	}

	public void setBookUnRented(Book book) throws BookDoesNotExistsException {
		// TODO Auto-generated method stub
		
	}

	public Collection<Book> listBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Book> listRentedBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
