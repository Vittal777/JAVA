package com.tktservice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.Ticket;
import com.bo.Train;
import com.repo.TicketRepo;
import com.trainservice.ServiceClass;

@Service("tktservice")
public class TktService implements ServiceImpl {

	@Autowired
	TicketRepo repo;
	
	@Autowired
	ServiceClass trainservice;
	
	public String checkSame(String passengerNo) {
		boolean res = trainservice.isTrainNoExists(passengerNo);
		if(res) {
			return "Found";
		}return "Not Found";
	}


	public String generateTicket(Ticket tkt1,String pno,String name) {
		UUID passengerId = UUID.randomUUID();
		tkt1.setPassengerId(passengerId);
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate date = ldt.toLocalDate();
		tkt1.setBookedDate(date);
		tkt1.setPassengerName(name);
		
		boolean res = trainservice.isTrainNoExists(pno);
		if(res){
			Train train = trainservice.findTrainByTrainNo(pno);
			tkt1.setPassenger_Departure(train.getDeparture());
			tkt1.setPassenger_arrival(train.getArrival());
			tkt1.setPassengertrainNo(pno);
			tkt1.setPrice(train.getPrice());
			tkt1.setTime(train.getTravelTime());
			tkt1.setTrainDate(train.getTravelDate());
			repo.save(tkt1);
			return "Passenger Details successfully persisted to DB";
		}
		return "Train Not Found";
		
	}
	
	
}
