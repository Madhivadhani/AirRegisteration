package com.airticketbooking.user.ViewFlight;

import java.util.List;

import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.repositary.AirTicketDB;

public class ViewFlightModel implements ViewFlightModelCallBack {
	ViewFlightControllerCallBack controllerCallBack;
	public ViewFlightModel(ViewFlightControllerCallBack viewFlightController) {
		// TODO Auto-generated constructor stub
		controllerCallBack = viewFlightController;
	}

	public List<Flight> getDetailsFromDB(String source,String destination) {
		List<Flight> ls= AirTicketDB.getInstance().getFlightDetails(source, destination);
		return ls;
	}
}
