package com.airticketbooking.user.cancelFlight;

import java.util.Scanner;

import com.airticketbooking.WelcomePage.WelcomePageView;

public class CancelView implements CancelViewCallBack{
	Scanner sc = new Scanner(System.in);
	CancelControllerCallBack cancelController;
	public CancelView() {
		// TODO Auto-generated constructor stub
		cancelController= new CancelController(this);
	}
	public void cancel() {
		CancelView view = new CancelView();
		view.cancelDisplay();
	}
//	public static void main(String[] args) {
//		CancelView view = new CancelView();
//		view.cancelDisplay();
//	}
	public void cancelDisplay() {
		System.out.println("*********Ticket Cancellation*****");	
		System.out.println("Enter your Booking ID");
		int id = sc.nextInt();
		cancelController.getID(id);
	}
	public void cancelSuccess() {
		System.out.println("Ticket Cancelled Successfully");
		WelcomePageView wv = new WelcomePageView();
		wv.displayMenu();
	}
	public void cancelFailed() {
		System.out.println("Cannot Cancel the ticket");
		WelcomePageView wv = new WelcomePageView();
		wv.displayMenu();
	}
}
