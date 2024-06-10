package com.controller;

import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tktservice.TktService;
import com.trainservice.ServiceClass;

import org.slf4j.Logger;

import com.bo.Ticket;
import com.bo.Train;
import com.exception.TrainNotFoundException;

@RestController
public class PassContr {

	@Autowired
	TktService service;
	
	@Autowired
	ServiceClass trainservice;
	
	Logger log = LoggerFactory.getLogger(PassContr.class);
	
	
	@GetMapping("/checkno/{pno}")
	public ResponseEntity<String> checking(@PathVariable String pno) {
	    try {
	        Train train = trainservice.findTrainByTrainNo(pno);
	        if (train != null) {
	            String result = "Departure : " + train.getDeparture() + " Arrival : " + train.getArrival();
	            return new ResponseEntity<String>(result, HttpStatus.FOUND);
	        } else {
	            return new ResponseEntity<String>("Train not found", HttpStatus.NOT_FOUND);
	        }
	    } catch (TrainNotFoundException e) {
	        // Handle TrainNotFoundException if thrown by trainservice.findTrainByTrainNo
	        return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	    } catch (Exception e) {
	        // Handle other exceptions
	        return new ResponseEntity<String>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	@PostMapping("/gen/{ptrain_No}/{pass_Name}")
	public ResponseEntity<String> genTicket(Ticket tktt,@PathVariable String ptrain_No,@PathVariable String pass_Name){
		boolean if_found = trainservice.isTrainNoExists(ptrain_No);
		if(if_found) {
			String res = service.generateTicket(tktt, ptrain_No, pass_Name);
			return new ResponseEntity<String>(res,HttpStatus.OK);
		}
		throw new TrainNotFoundException("Not Found");
	}
	
	
	
	
	
	@PostMapping("/{name}")
	public String display(@PathVariable String name) {
		return name;
	}
}
