package com.airticketbooking.user.login;

import java.util.Scanner;

import com.airticketbooking.user.ViewFlight.ViewFlightView;
import com.airticketbooking.user.cancelFlight.CancelView;

public class LoginView implements LoginViewCallBack {
	private Scanner sc = new Scanner(System.in);
	 LoginController controller ;
	 public LoginView() {
		  controller = new LoginController(this);
	}
	
	public void travel() {
		loginCheck();
	}

	public void loginCheck() {
		System.out.println();
		System.out.println("**********WELCOME TO AIR TIKET BOOKING**********");
		System.out.println();
		System.out.println("Enter your username:");
		String username = sc.nextLine();
		System.out.println("Enter your password");
		String password=sc.nextLine();
		controller.checkCredential(username, password);
	}
	public void loginSuccess() {
		System.out.println("Login Successfull");
		System.out.println("Press 1 to book Ticket");
		System.out.println("Press 2 to cancel Tickets");
		int option = sc.nextInt();
		if(option==1) {
			ViewFlightView v = new ViewFlightView();
			v.travel();
		}
		if(option==2) {
			CancelView c = new CancelView();
			c.cancel();
		}
	}
	public void loginFail() {
		System.out.println("Login Failed");
	}
	
}
