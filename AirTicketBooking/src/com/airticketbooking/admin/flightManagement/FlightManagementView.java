package com.airticketbooking.admin.flightManagement;

import java.util.Scanner;

import com.airticketbooking.WelcomePage.WelcomePageView;
import com.airticketbooking.user.ViewFlight.ViewFlightView;

public class FlightManagementView implements FlightViewCallBack{
	private Scanner sc = new Scanner(System.in);
	FlightManagementController controller ;
	public FlightManagementView() {
		controller = new FlightManagementController(this);
	}
	public void flightDetails() {
		System.out.println("***Welcome Admin***");
		System.out.println();
		System.out.println("Enter Flight Details");
		System.out.println("*****************");
		System.out.println("Enter Flight number");
		String flightNo = sc.nextLine();
		System.out.println("Enter the Source");
		String source = sc.nextLine();
		System.out.println("Enter Destination");
		String destination =sc.nextLine();
		System.out.println("Enter No of Available Ticket");
		int tickets = sc.nextInt();
		System.out.println("Enter Boarding Time");
		String boardingTime = sc.next();
		System.out.println("Enter Arraival Time");
		String arraivalTime = sc.next();
		System.out.println("Enter the Fare amount");
		int amount = sc.nextInt();
		
		controller.addFlightDetails(flightNo, source, destination, tickets,boardingTime,arraivalTime,amount);
	}
	
	public void flightSuccess() {
		System.out.println("Successfully Added Flight Details");
		WelcomePageView wv = new WelcomePageView();
		wv.displayMenu();

	}
	public void flightFail() {
		System.out.println("Sorry, Unable to add Flight Details");
		WelcomePageView wv = new WelcomePageView();
		wv.displayMenu();
	}

}
