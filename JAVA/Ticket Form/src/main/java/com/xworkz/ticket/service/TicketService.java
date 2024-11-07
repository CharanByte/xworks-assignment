package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDTO;

public interface TicketService {
	
	boolean isValidAndSave(TicketDTO ticketDTO);

}
