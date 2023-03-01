package com.airticketbooking.admin.dto;

import java.util.Date;

public class Flight {
	private String flightNumber ;
	private String source ;
	private String destination;
	private int noOfTickets;
	private String boardingTime;
	private String arraivalTime;
	private int amount;
	
	
	public Flight(String flightNumber, String source, String destination, int noOfTickets, String boardingTime,
			String arraivalTime,int amount) {
		super();
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.noOfTickets = noOfTickets;
		this.boardingTime = boardingTime;
		this.arraivalTime = arraivalTime;
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getBoardingTime() {
		return boardingTime;
	}

	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}

	public String getArraivalTime() {
		return arraivalTime;
	}

	public void setArraivalTime(String arraivalTime) {
		this.arraivalTime = arraivalTime;
	}

	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", source=" + source + ", destination=" + destination
				+ ", noOfTickets=" + noOfTickets + ", boardingTime=" + boardingTime + ", arraivalTime=" + arraivalTime
				+ ", amount=" + amount + "]";
	}

	
	
}
