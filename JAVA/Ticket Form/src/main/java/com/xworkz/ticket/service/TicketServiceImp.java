package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.TicketDTO;
import com.xworkz.ticket.repo.TicketRepository;
import com.xworkz.ticket.repo.TicketRepositoryImp;

public class TicketServiceImp implements TicketService{

	@Override
	public boolean isValidAndSave(TicketDTO ticketDTO) {
		boolean valid =true;
		if(ticketDTO!=null) {
			String ticketName=ticketDTO.getTicketName();
			if(ticketName!=null) {
				System.out.println("ticket name is valid");
			}
			else {
				System.err.println("ticket name is not valid");
				valid=false;
			}
			
			int ticketNo=ticketDTO.getTicketNo();
			if(ticketNo>0) {
				System.out.println("ticketNo is valid");
			}
			else {
				System.err.println("ticketNo is not valid");
				valid=false;
			}
			
			long contact=ticketDTO.getContact();
			if(contact>0) {
				System.out.println("ticketcontact is valid");
			}
			else {
				System.err.println("ticketContact is not valid");
				valid=false;
			}
			String email = ticketDTO.getEmail();
			if (email != null && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
				System.out.println("Email is valid");
			} else {
				System.out.println("Email is not vallid");
				valid = false;
			}
			
			TicketRepository ticketRepositoryImp=new TicketRepositoryImp();
			int pk=ticketRepositoryImp.save(ticketDTO);
			if(pk>0) {
				System.out.println("saved in database");
				valid=true;
			}
			else {
				System.out.println("not saved in database");
				valid=false;
			}
		}
		
		return valid;
	}

}
