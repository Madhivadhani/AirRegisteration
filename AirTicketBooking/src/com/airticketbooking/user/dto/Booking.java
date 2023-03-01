package com.airticketbooking.user.dto;

public class Booking {
	private String source;
	private String destination;
	private String pname;
	private int age;
	private String flightNo;
	private static int stBooking =100;
	private int bookingId;
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	public Booking(String source, String destination, String pname, int age,String flightNo) {
		super();
		this.source = source;
		this.destination = destination;
		this.pname = pname;
		this.age = age;
		this.flightNo=flightNo;
		this.bookingId = stBooking;
		stBooking++;
	}
	
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Booking [source=" + source + ", destination=" + destination + ", pname=" + pname + ", age=" + age
				+ ", flightNo=" + flightNo + ", bookingId=" + bookingId + "]";
	}
	

	
	
	

}
