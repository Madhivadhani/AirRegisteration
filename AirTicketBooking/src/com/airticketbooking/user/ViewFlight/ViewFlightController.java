package com.airticketbooking.user.ViewFlight;

import java.util.ArrayList;
import java.util.List;

import com.airticketbooking.admin.dto.Flight;

public class ViewFlightController implements ViewFlightControllerCallBack {
	ViewFlightModelCallBack modelCallBack;
	ViewFlightViewCallBack viewCallBack;
	public ViewFlightController(ViewFlightViewCallBack viewFlightView) {
		// TODO Auto-generated constructor stub
		this.viewCallBack = viewFlightView;
		this.modelCallBack = new ViewFlightModel(this);
	}


	public void getDetails(String source,String destination) {
		List<Flight> ls = new ArrayList<>();
		ls =modelCallBack.getDetailsFromDB(source, destination);
		if(ls.isEmpty()) {
			viewCallBack.noFlightAvailable();
		}
		else {
			viewCallBack.displayDetails(ls);
		}
		
	}
}
