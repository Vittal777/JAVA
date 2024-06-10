package com.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.bo.Ticket;

public interface TicketRepo extends JpaRepository<Ticket,Long>{

}
