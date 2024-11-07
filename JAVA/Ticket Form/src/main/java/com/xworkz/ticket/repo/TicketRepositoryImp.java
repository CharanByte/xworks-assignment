package com.xworkz.ticket.repo;

import com.xworkz.ticket.dto.TicketDTO;

public class TicketRepositoryImp implements TicketRepository{

	@Override
	public int save(TicketDTO ticketDTO) {
		System.out.println("running save method");
		return 1;
	}

}
