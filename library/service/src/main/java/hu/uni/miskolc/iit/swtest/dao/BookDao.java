package hu.uni.miskolc.iit.swtest.dao;

import java.util.Collection;

import hu.uni.miskolc.iit.swtest.model.Book;

public interface BookDao {
	void createBook(Book book);
	Collection<Book> readBooks();
	void updeateBook(int bookId, Book updatedBook);
	void deleteBook(Book book);
}
