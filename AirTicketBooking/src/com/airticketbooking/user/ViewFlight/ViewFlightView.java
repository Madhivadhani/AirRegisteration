package com.airticketbooking.user.ViewFlight;

import java.util.List;
import java.util.Scanner;

import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.user.BookFlight.BookFlightView;



public class ViewFlightView implements ViewFlightViewCallBack{
	private Scanner sc = new Scanner(System.in);
	ViewFlightController controller ;
	BookFlightView bookFlightView;
	String date;
	public ViewFlightView() {
		// TODO Auto-generated constructor stub
		controller = new ViewFlightController(this);
		
	}
	
	public  void travel() {
		ViewFlightView v = new ViewFlightView();
		v.getflightDetails();
	}
	
	public void getflightDetails() {
		System.out.println("Enter the Source");
		String source = sc.nextLine();
		System.out.println("Enter Destination");
		String destination = sc.nextLine();
		System.out.println("Enter Date of travel");
		date = sc.nextLine();
		
		controller.getDetails(source, destination);
	}
	public void displayDetails(List<Flight>ls) {
		System.out.println("Available Flights");
		System.out.println("___________________________________________________________________________________________________________________________________________");
		System.out.println("FlightNo"+"\t" +"Source"+"\t"+" Destination"+"\t"+"Boarding Time"+"\t"+"Departure Time"+"\t"+"AvailableTickets"+"\t"+"Fare");
		for(int i=0;i<ls.size();i++) {
			Flight f = ls.get(i);
			System.out.println(f.getFlightNumber()+"\t\t"+f.getSource() +"\t"+f.getDestination()+"\t"+f.getBoardingTime()+"\t\t"+f.getArraivalTime()+"\t\t\t"+f.getNoOfTickets()+"\t\t"+f.getAmount());
		}
		System.out.println("Do You want to Proceed Booking Y/N");
		char option = sc.next().toLowerCase().charAt(0);
		if(option=='y') {
			System.out.println("Enter the Flight number");
			String fno = sc.next();
			Flight f=null;
			for(int i=0;i<ls.size();i++) {
				if(ls.get(i).getFlightNumber().equals(fno)) {
					f=ls.get(i);
				}
			}
			bookFlightView = new BookFlightView();
			bookFlightView.bookTicket(f,date);
		}
		else {
			System.out.println("Thank You ! See You Soon");
		}
		
		
		
	}
	
	public void noFlightAvailable() {
		System.out.println("Sorry No Flights Available for the requested source and destination");
	}
}
