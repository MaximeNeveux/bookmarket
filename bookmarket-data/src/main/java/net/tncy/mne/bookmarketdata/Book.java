package net.tncy.mne.bookmarketdata;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publisher;
	private BookFormat format;
	private String isbn;
	
	public Book(String title, String author, String publisher, String isbn) {
		this.id=50;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.isbn=isbn;
	}
	
}
