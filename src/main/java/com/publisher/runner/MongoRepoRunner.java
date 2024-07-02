package com.publisher.runner;

import com.publisher.entity.Book;
import com.publisher.service.BookService;
import com.publisher.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoRepoRunner implements CommandLineRunner {


	@Autowired
	BookService bookService;

	@Override
	public void run(String... args) throws Exception {

		publishABook();


	}



	private void publishABook() {
		Book book = new Book();
		book.setTitle("Telugu");
		book.setAuthor("Anand");
		book.setPages(690);
		bookService.publishBookService(book);
	}





}