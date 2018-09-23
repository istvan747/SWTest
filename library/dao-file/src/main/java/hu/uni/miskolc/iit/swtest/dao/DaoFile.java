package hu.uni.miskolc.iit.swtest.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

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
		for(Book b: bookList) {
			if(b.equals(book)) {
				throw new DuplicatedBookEntryException(book + " is exists!");
			}
		}		
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(database))  ) {
			String record = getNextID() + FIELD_SEPARATOR + marshalToRecord(book);
			bf.write(record);
			bf.newLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

	public Collection<Book> readBooks() {
		Collection<Book> bookList = null;
		try(BufferedReader bf = new BufferedReader(new FileReader(database))) {
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookList;
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
	
	private String marshalToRecord(Book book) {
		return book.getTitle() + FIELD_SEPARATOR + book.getAuthor() + FIELD_SEPARATOR +
				book.getGenre() + FIELD_SEPARATOR + (new SimpleDateFormat("yyyy.MM.dd.")).format(book.getReleased());
	}
	
	private Book recordToBook(String record) {
		Book book = new Book();
		StringTokenizer strt = new StringTokenizer(record, FIELD_SEPARATOR);
		
		book.setTitle(strt.nextElement() + "");
		return book;
	}
	
	private int getNextID() {
		int nextID = 0;
		try(BufferedReader bf = new BufferedReader(new FileReader(database))){
			ArrayList<Integer> ids = new ArrayList();
			String line;
			while((line = bf.readLine()) != null) {
				StringTokenizer strt = new StringTokenizer(line, ";");
				try {
					int id = Integer.parseInt( strt.nextElement() + "" );
					ids.add(id);					
				}catch(NumberFormatException e) {
					
				}
			}
			nextID = Collections.max(ids) + 1;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nextID;
	}

}
