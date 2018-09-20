package com.allysson.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.allysson.helpdesk.api.entity.User;

public interface UserRespository extends MongoRepository<User, String> {
	
	User findByEmail(String email);

	User save(String user);

	User findOne(String id);

	void delete(String id);


}
