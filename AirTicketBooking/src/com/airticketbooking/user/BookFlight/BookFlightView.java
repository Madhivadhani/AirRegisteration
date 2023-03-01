package com.airticketbooking.user.BookFlight;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.airticketbooking.WelcomePage.WelcomePageView;
import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.user.ViewFlight.ViewFlightView;
import com.airticketbooking.user.cancelFlight.CancelView;
import com.airticketbooking.user.dto.Booking;

public class BookFlightView implements BookFlightViewCallBack {
	  private Scanner sc= new Scanner(System.in);
	  BookFlightController controller ;
	  public BookFlightView() {
		// TODO Auto-generated constructor stub
		  controller = new BookFlightController(this);
	  }
  
    public void travel(Flight f,String date) {
    	BookFlightView v = new BookFlightView();
    	v.bookTicket(f, date);
    }
    
    
	public void bookTicket(Flight f,String date) {
		System.out.println(f.getFlightNumber() +"  "+ f.getSource() + "to "+ f.getDestination());
		System.out.println("Total fare "+"Rs:"+f.getAmount());
		System.out.println("Do you want to proceed booking ticket Y/N");
		char option = sc.next().charAt(0);
		controller.bookFlightOption(option, f);
			
	}
	public void getPassengerNumber(Flight f) {
		System.out.println("Enter number of Passenger");
		int numberOfPassenger = sc.nextInt();
		if(controller.checkEligible(f, numberOfPassenger)) {
			controller.addPassengers(f,numberOfPassenger);
		}
		else {
			System.out.println("Ticket Limit Exceeded");
			BookFlightView v = new BookFlightView();
			v.getPassengerNumber(f);
		}
	}
	public void getPassengersDetails(Flight f,int n) {
		HashMap<String,Integer> hm = new LinkedHashMap<>();
		for(int i=0;i<n;i++)
		 {
			System.out.println("Enter Passenger Name");
			String name = sc.next();
			System.out.println("Enter Age");
			int age = sc.nextInt();
			hm.put(name, age);
			
		}
		controller.addPassengersDetails(hm, f.getSource(), f.getDestination(),n, f);
		
	}
	public void displayTicket(List<Booking> ls,Flight f) {
		System.out.println("Ticket Details");
		System.out.println("BookingID"+"->"+"Name"+"==>"+"Age"+"==>"+"Flight Number"+"==>"+"Boarding At"+"==>"+"Destination"+"==>"+"Boarding Time"+"==>"+"Departure Time"+"==>"+"Ticket Fair");
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i).getBookingId()+"-->"+ls.get(i).getPname()+"-->"+ls.get(i).getAge()+"-->"+f.getFlightNumber()+"-->"+f.getSource()+"-->"+f.getDestination()+"-->"+
			f.getBoardingTime()+"-->"+f.getArraivalTime()+"-->"+f.getAmount());	
		}
		System.out.println("********Total Amount to be paid\t"+ f.getAmount()*ls.size()+"***************");
		WelcomePageView wv = new WelcomePageView();
		wv.displayMenu();

	}
	public void endGreeting() {
			System.out.println("Thank you! See you soon");
	}
	public void successBooking(Flight f) {
		System.out.println("Successfully Booked Tickets");
		
	}
	public void failed() {
		
		System.out.println("Sorry! Unable to Book your Ticket");
		WelcomePageView wv = new WelcomePageView();
		wv.displayMenu();
	}
}
