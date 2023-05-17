package com.mycatgib.springstudy.di.basic2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "bookStore")
public class BookStore {

//	@Autowired
//	@Qualifier(value = "qv3")
	private final Book book;


//	@Autowired
	public BookStore(Book book) {
		this.book = book;
	}
	public Book getBook() {
		return book;
	}

//	public void setBook(Book book) {
//		this.book = book;
//	}
	@Override
	public String toString() {
		return "BookStore [book=" + book + "]";
	}

}
