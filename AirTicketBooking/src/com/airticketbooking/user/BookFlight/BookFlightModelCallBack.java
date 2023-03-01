package com.airticketbooking.user.BookFlight;

import java.util.HashMap;

import com.airticketbooking.admin.dto.Flight;

public interface BookFlightModelCallBack {
	public boolean  bookFlightDB(Flight f);
	public void addPassengerDB(HashMap<String,Integer> hm,String source,String destination,int n,Flight f) ;
}
