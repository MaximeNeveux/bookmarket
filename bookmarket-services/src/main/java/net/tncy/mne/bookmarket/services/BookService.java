package net.tncy.mne.bookmarket.services;

import net.tncy.mne.bookmarketdata.Book;

public class BookService {
	
	public int createBook(String title, String author, String publisher, String ISBN) {
		Book b = new Book(title,author,publisher,ISBN);
		return 0;
	}

}
