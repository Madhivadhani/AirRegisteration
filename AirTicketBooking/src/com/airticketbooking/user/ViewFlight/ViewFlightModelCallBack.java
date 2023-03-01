package com.airticketbooking.user.ViewFlight;

import java.util.List;

import com.airticketbooking.admin.dto.Flight;

public interface ViewFlightModelCallBack {
	public List<Flight> getDetailsFromDB(String source,String destination);
}
