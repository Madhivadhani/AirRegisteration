package com.airticketbooking.user.BookFlight;

import java.util.HashMap;
import java.util.List;

import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.user.dto.Booking;

public interface BookFlightControllerCallBack {
	public void bookFlightOption(char option,Flight f);
	public boolean checkEligible(Flight f,int n);
	void addPassengers(Flight f,int n);
	void addPassengersDetails(HashMap<String,Integer> hm,String source,String destination,int n,Flight f);
	public void fail();
	public void ticketBooked(List<Booking> ls,Flight f);
}
