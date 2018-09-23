package hu.uni.miskolc.iit.swtest.service;

import java.util.Collection;

import hu.uni.miskolc.iit.swtest.model.Book;

public interface BookManagerService {
	void recordBook(Book book);	
	
	Collection<Book> listBooks();
	Collection<Book> listRentedBooks();
}
