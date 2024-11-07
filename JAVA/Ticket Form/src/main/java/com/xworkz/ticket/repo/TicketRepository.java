package com.xworkz.ticket.repo;

import com.xworkz.ticket.dto.TicketDTO;

public interface TicketRepository {
	
	int save(TicketDTO ticketDTO);
}
