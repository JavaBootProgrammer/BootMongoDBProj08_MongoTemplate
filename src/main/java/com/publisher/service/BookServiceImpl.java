package com.publisher.service;

import com.publisher.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("dockService")
public class BookServiceImpl implements BookService {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public void publishBookService(Book newBook) {

		String dockID = mongoTemplate.insert(newBook).getId();

		System.out.println(dockID + " document ID");


	}





}
