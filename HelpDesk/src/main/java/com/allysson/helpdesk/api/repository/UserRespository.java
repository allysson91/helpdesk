package com.allysson.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.allysson.helpdesk.api.entity.User;

public interface UserRespository extends MongoRepository<User, String> {

}
