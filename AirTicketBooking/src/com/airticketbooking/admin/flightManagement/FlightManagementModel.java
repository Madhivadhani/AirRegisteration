package com.airticketbooking.admin.flightManagement;

import com.airticketbooking.repositary.AirTicketDB;

public class FlightManagementModel implements FlightModelCallBack{
	private FlightControllerCallBack controller;
	public FlightManagementModel(FlightControllerCallBack flightManagementController) {
		// TODO Auto-generated constructor stub
		this.controller = flightManagementController;
	}

	public boolean addFlightDB(String flightNo,String source,String destination,int ticket,String boardingtime,String departuretime,int amount) {
		if(AirTicketDB.getInstance().addFlight(flightNo, source, destination, ticket,boardingtime,departuretime,amount))
			return true;
		return false;
	}


}
