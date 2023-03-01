package com.airticketbooking.admin.adminLogin;

import java.util.Scanner;



import com.airticketbooking.WelcomePage.WelcomePageView;
import com.airticketbooking.admin.dto.Flight;
import com.airticketbooking.admin.flightManagement.FlightManagementView;

public class AdminLoginView implements AdminLoginViewCallBack{
	private Scanner sc = new Scanner(System.in);
	private AdminLoginControl adminLoginControl;
	public AdminLoginView() {
		 adminLoginControl= new AdminLoginControl(this);
		
	}
	public void travel() {
		AdminLoginView al = new AdminLoginView();
		al.adminEntry();
	}

	public void adminEntry() {
		System.out.println("Enter Admin ID");
		String aUser= sc.nextLine();
		
		System.out.println("Enter Passcode");
		String aPassword = sc.nextLine();
		
		adminLoginControl.checkisAdmin(aUser, aPassword);
	}
	
	public void adminSuccess() {
		FlightManagementView flight = new FlightManagementView();
		flight.flightDetails();
	}
	public void adminFail() {
		System.out.println("Fail");
		WelcomePageView wv = new WelcomePageView();
		wv.displayMenu();
	}
}
