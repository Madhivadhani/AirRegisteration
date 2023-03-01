package com.airticketbooking.user.BookFlight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.repositary.AirTicketDB;
import com.airticketbooking.user.dto.Booking;

public class BookFlightModel implements BookFlightModelCallBack {
	private BookFlightControllerCallBack controllerBack;
	public BookFlightModel(BookFlightControllerCallBack bookFlightController) {
		// TODO Auto-generated constructor stub
		this.controllerBack =bookFlightController;
	}

	public void addPassengerDB(HashMap<String,Integer> hm,String source,String destination,int n,Flight f) {
		List<Booking> book = new ArrayList<>();
			for(Map.Entry<String, Integer> e: hm.entrySet()) {
				String name = e.getKey();
				int age = e.getValue();
				book.add(AirTicketDB.getInstance().addPassengerDB(source, destination, name, age, f));	
			}
			controllerBack.ticketBooked(book,f);
	}
	public boolean  bookFlightDB(Flight f) {
		if(AirTicketDB.getInstance().bookTicket(f)) {
			return true;
		}
		return false;
	}
	
}
