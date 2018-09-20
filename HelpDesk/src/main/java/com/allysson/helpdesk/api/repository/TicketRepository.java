package com.allysson.helpdesk.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.allysson.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {

	Page<Ticket> findByUserId(Pageable pages, String userId);

	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityOrderByDateDesc(String title,
			String status, String priority, Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityAndUserIdOrderByDateDesc(String title,
			String status, String priority, Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityAndAssignedUserIdOrderByDateDesc(String title,
			String status, String priority, Pageable pages);
	
	Page<Ticket> findByNumber(Integer number, Pageable pages);
	
}
