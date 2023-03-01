package com.airticketbooking.user.BookFlight;

import java.util.HashMap;
import java.util.List;

import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.user.dto.Booking;

public interface BookFlightViewCallBack {
	public void travel(Flight f,String date);
	public void bookTicket(Flight f,String date) ;
	public void endGreeting();
	public void successBooking(Flight f);
	public void failed();
	public void getPassengerNumber(Flight f);
	public void getPassengersDetails(Flight f,int n);
	 void displayTicket(List<Booking> ls,Flight f);
}
