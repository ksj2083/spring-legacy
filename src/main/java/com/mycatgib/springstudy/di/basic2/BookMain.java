package com.mycatgib.springstudy.di.basic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new FileSystemXmlApplicationContext("src/main/java/com/mycatgib/springstudy/di/basic2/book.xml");

		BookStore bookStore = (BookStore) applicationContext.getBean("bookStore");

		System.out.println(bookStore);

	}
}
