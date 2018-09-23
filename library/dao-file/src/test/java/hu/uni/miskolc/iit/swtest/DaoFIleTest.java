package hu.uni.miskolc.iit.swtest;

import java.io.File;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hu.uni.miskolc.iit.swtest.dao.BookDAO;
import hu.uni.miskolc.iit.swtest.dao.DaoFile;
import hu.uni.miskolc.iit.swtest.exceptions.DuplicatedBookEntryException;
import hu.uni.miskolc.iit.swtest.model.Book;
import hu.uni.miskolc.iit.swtest.model.Genre;

public class DaoFIleTest {

	private static File DEFAULT_DB_STATE;	
	private BookDAO daoFile;
	
	@BeforeClass
	public static void beforeClass() {
		DEFAULT_DB_STATE = new File("src\\resources\\database.csv");
	}
	
	@Before
	public void setUp() {
		daoFile = new DaoFile(DEFAULT_DB_STATE.getPath()); 
	}
	
	@Test
	public void testCreateBook() {
		Book book1 = new Book("A Gyűrűk ura", "Tolkien", Genre.FANTASY, new Date(), false);
		Book book2 = new Book("Számítógép hálózatok", "Tannenbaum", Genre.FANTASY, new Date(), false);
		try {
			daoFile.createBook(book1);
			daoFile.createBook(book2);
		} catch (DuplicatedBookEntryException e) {
			e.printStackTrace();
		}
	}
}
