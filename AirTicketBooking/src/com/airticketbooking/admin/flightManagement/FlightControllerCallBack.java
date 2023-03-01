package com.airticketbooking.admin.flightManagement;

public interface FlightControllerCallBack {
	public void addFlightDetails(String flightNo,String source,String destination,int ticket, String boardingTime, String arraivalTime, int amount);

}
