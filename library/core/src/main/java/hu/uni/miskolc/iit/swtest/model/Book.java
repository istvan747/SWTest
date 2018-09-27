package hu.uni.miskolc.iit.swtest.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
	private int id;
	private String title;
	private String author;
	private Genre genre;
	private Date released;
	private boolean rented;
	
	public Book(String title, String author, Genre genre, Date released, boolean rented) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.released = released;
		this.rented = rented;
	}
	
	public Book(Book book) {
		this.id = book.id;
		this.title = book.title;
		this.author = book.author;
		this.genre = book.genre;
		this.released = new Date(book.released.getTime());
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

	public Date getReleased() {
		return released;
	}

	public void setReleased(Date released) {
		this.released = released;
	}

	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}
	
	

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy");
		return "Book [title=" + title + ", author=" + author + ", genre=" + genre + ", released=" + format.format(released) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + id;
		result = prime * result + ((released == null) ? 0 : released.hashCode());
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
		if (released == null) {
			if (other.released != null)
				return false;
		} else if (!released.equals(other.released))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}
