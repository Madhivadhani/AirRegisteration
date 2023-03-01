package com.airticketbooking.repositary;

import java.util.ArrayList;
import java.util.List;

import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.user.dto.Booking;
import com.airticketbooking.user.dto.User;

public class AirTicketDB {
	private static AirTicketDB airTicketDB;
	private static List<User> user = new ArrayList<>();
	private static List<Flight> flight = new ArrayList<>();
	private static List<Booking> book = new ArrayList<>();
	
	public AirTicketDB() {
		
	}
	public static AirTicketDB getInstance() {
		if(airTicketDB==null) {
			 airTicketDB =new AirTicketDB();
			 user.add(new User("user", "user@gmail.com", "9552743136", "user"));
			 flight.add(new Flight("100", "Coimbatore", "Chennai", 98,"10:00","13:00",6000));
			 flight.add(new Flight("101", "Chennai", "Mumbai", 60,"14:00","20:00",9000));
			 flight.add(new Flight("102", "Delhi", "Bangalore", 98,"13:00","21:00",9800));
			 flight.add(new Flight("103", "Coimbatore", "Mumbai", 98,"14:00","19:30",8000));
			 flight.add(new Flight("104", "Chennai", "Coimbatore", 8,"15:00","17:00",6970));
			 flight.add(new Flight("105", "Coimbatore", "Chennai", 9,"12:00","14:00",6090));
			 book.add(new Booking("Chennai","Coimbatore","Raja",55,"104"));
			 book.add(new Booking("Chennai","Coimbatore","Ramu",52,"104"));
			 book.add(new Booking("Coimbatore","Chennai","Dinesh",34,"104"));
			 
		}
		return airTicketDB;
	}
	public boolean bookTicket(Flight f) {
		int tickets = f.getNoOfTickets()-1;
		if(tickets>=0) {
			f.setNoOfTickets(tickets);
			return true;
		}
		
		return false;
	}
	public boolean cancelTicketDB(int id) {
		for(int i=0;i<book.size();i++) {
			int bookId = book.get(i).getBookingId();
			if(id==bookId) {
				String fno = book.get(i).getFlightNo();
				Flight fl=flight.get(0);
				for(int j=0;j<flight.size();j++) {
					if(fno.equals(flight.get(i).getFlightNumber())) {
						fl=flight.get(i);
						break;
					}
				}
				book.remove(i);
				int tic=fl.getNoOfTickets()+1;
				fl.setNoOfTickets(tic);	
				return true;
			}
		}
		return false;
	}
	public Booking addPassengerDB(String source,String destination,String name,int age,Flight f) {
		Booking b = new Booking(source,destination,name,age,f.getFlightNumber());
		if(book.add(b)){
			int ticket=f.getNoOfTickets()-1;
			f.setNoOfTickets(ticket);
			return b;
		}	
		return null;
		
	}
	public  boolean addUser(String userName, String email, String phone, String password) {
		
		return user.add(new User(userName, email, phone, password));

	}
	public boolean addFlight(String flightNo,String source,String destination,int ticket,String boardingtime,String departuretime,int amount) {
		
		
		return flight.add(new Flight(flightNo, source, destination, ticket,boardingtime,departuretime,amount));
		
		
	}
	public List<Flight> getFlightDetails(String source,String destination){
		List<Flight> ls = new ArrayList<>();
		for(int i=0;i<flight.size();i++) {
			Flight f = flight.get(i);
			if(f.getSource().toLowerCase().equals(source.toLowerCase()) && f.getDestination().toLowerCase().equals(destination.toLowerCase())) {
				ls.add(f);
			}
		}
		return ls;
	}
	public boolean isValidUser(String username,String password) {
		User u=user.get(user.size()-1);
		if(u.getUserName().equals(username)&& u.getPassword().equals(password)) {
			return true;
		}
		return false;
		
	}
	public boolean isValidAdmin(String aUsername,String aPassword) {
		if(aUsername.equals("admin")&& aPassword.equals("admin")) {
			return true;
		}
		return false;
	}
	

}
