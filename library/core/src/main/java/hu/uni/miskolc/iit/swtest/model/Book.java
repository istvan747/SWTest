package hu.uni.miskolc.iit.swtest.model;

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
	
	
	
}
