package com.airticketbooking.admin.flightManagement;

public interface FlightModelCallBack {
	public boolean addFlightDB(String flightNo,String source,String destination,int ticket,String boardingtime,String departuretime,int amount);
}
