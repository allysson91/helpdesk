package com.allysson.helpdesk.service;

import org.springframework.data.domain.Page;

import com.allysson.helpdesk.api.entity.User;

public interface UserService {

	User findByEmail(String emai);
	
	User createOrUpdate(String user);
	
	User findById(String id);
	
	void  delete (String id);
	
	Page<User> findAll(int page, int count);
	
}
