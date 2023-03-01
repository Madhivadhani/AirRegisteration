package com.airticketbooking.user.ViewFlight;

import java.util.List;

import com.airticketbooking.admin.dto.Flight;

public interface ViewFlightViewCallBack {
	public void getflightDetails();
	public void displayDetails(List<Flight> ls);
	public void noFlightAvailable();
	 void travel();
}
