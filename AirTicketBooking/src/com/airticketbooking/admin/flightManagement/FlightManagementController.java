package com.airticketbooking.admin.flightManagement;

public class FlightManagementController implements FlightControllerCallBack{
	
	private FlightModelCallBack modelcall;
	private FlightViewCallBack viewcall;
	
	public FlightManagementController(FlightViewCallBack flightManagementView) {
		// TODO Auto-generated constructor stub
		this.viewcall=flightManagementView;
		this.modelcall = new FlightManagementModel(this);
	}

	public void addFlightDetails(String flightNo,String source,String destination,int ticket, String boardingTime, String arraivalTime, int amount) {
		if(modelcall.addFlightDB(flightNo, source, destination, ticket,boardingTime,arraivalTime,amount)) {
			viewcall.flightSuccess();
		}
		else {
			viewcall.flightFail();
		}
	}

}
