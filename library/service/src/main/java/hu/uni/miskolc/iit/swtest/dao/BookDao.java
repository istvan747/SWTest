package hu.uni.miskolc.iit.swtest.dao;

import java.util.Collection;

import hu.uni.miskolc.iit.swtest.exceptions.DuplicatedBookEntryException;
import hu.uni.miskolc.iit.swtest.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.swtest.model.Book;

public interface BookDao {
	void createBook(Book book) throws DuplicatedBookEntryException;
	Collection<Book> readBooks();
	void updeateBook(int bookId, Book updatedBook) throws EntryNotFoundException;
	void deleteBook(Book book) throws EntryNotFoundException;
}
