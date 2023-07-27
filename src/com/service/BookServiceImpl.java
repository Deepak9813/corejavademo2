package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Book;

public class BookServiceImpl implements BookService {

	static List<Book> blist = new ArrayList<>();

	@Override
	public void addBook(Book b) {
		blist.add(b);
		System.out.println("===========successfully added======== Size = " + blist.size());

	}

	@Override
	public void deleteBook(int index) {
		blist.remove(index);
	}

	@Override
	public void updateBook(Book b) {
		blist.add(b);

	}

	@Override
	public List<Book> getAllBook() {
		
		return blist;
	}

}
