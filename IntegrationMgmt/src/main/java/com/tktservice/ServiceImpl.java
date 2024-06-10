package com.tktservice;

import com.bo.Ticket;

public interface ServiceImpl {

	public String checkSame(String passengerNo);
	public String generateTicket(Ticket ticket,String pname,String name);
}
