package hu.uni.miskolc.iit.swtest.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	private int id;
	private String title;
	private String author;
	private Genre genre;
	private int releasedYear;
	private boolean rented;
	
	public Book(String title, String author, Genre genre, int releasedYear, boolean rented) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.releasedYear = releasedYear;
		this.rented = rented;
	}
	
	public Book(Book book) {
		this.id = book.id;
		this.title = book.title;
		this.author = book.author;
		this.genre = book.genre;
		this.releasedYear = book.releasedYear;
		this.rented = book.rented;
	}
	
	public Book() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}	

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + ", released=" + releasedYear + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + releasedYear;
		result = prime * result + (rented ? 1231 : 1237);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (genre != other.genre)
			return false;
		if (id != other.id)
			return false;
		if (releasedYear != other.releasedYear)
			return false;
		if (rented != other.rented)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}	
	
	
}
