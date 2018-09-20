package com.allysson.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.allysson.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatus(String ticketId);
	
}
