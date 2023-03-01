package com.airticketbooking.user.BookFlight;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.user.dto.Booking;

public class BookFlightController implements BookFlightControllerCallBack {
	private BookFlightViewCallBack viewback;
	private BookFlightModelCallBack modelback;
	public BookFlightController(BookFlightViewCallBack bookFlightView) {
		// TODO Auto-generated constructor stub
		this.viewback = bookFlightView;
		this.modelback = new BookFlightModel(this);
	}

	public void bookFlightOption(char option,Flight f) {
		if(option=='y') {
			viewback.getPassengerNumber(f);
		}
		else {
			viewback.endGreeting();
		}
	}
	public boolean checkEligible(Flight f,int n) {
		if(f.getNoOfTickets()>=n) {
			return true;
		}
		else
			return false;
		
	}
	public void addPassengers(Flight f,int n) {
			viewback.getPassengersDetails( f,n);
	
	}
	public void addPassengersDetails(HashMap<String,Integer> hm,String source,String destination,int n,Flight f) {
		modelback.addPassengerDB(hm, source, destination, n,f);
		
	}
	public void ticketBooked(List<Booking> ls,Flight f) {
		viewback.displayTicket(ls,f);
	}
	public void fail() {
		viewback.failed();
	}
}
