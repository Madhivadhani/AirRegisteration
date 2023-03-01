package com.airticketbooking.WelcomePage;

import java.util.Scanner;

import com.airticketbooking.admin.adminLogin.AdminLoginView;
import com.airticketbooking.user.login.LoginView;
import com.airticketbooking.user.register.RegisterView;


public class WelcomePageView {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		WelcomePageView wp = new WelcomePageView();
		wp.displayMenu();
	}
	public void displayMenu() {
		System.out.println("************Welcome to Flight Ticket Booking*****************");
		System.out.println("Press 1 for Admin Login");
		System.out.println("Press 2 for New Registration");
		System.out.println("Press 3 for Sign in");
		System.out.println("Press 4 for Cancel Ticket");
		int choice = sc.nextInt();
		if(choice==1) {
			AdminLoginView ad = new AdminLoginView();
			ad.travel();
		}
		if(choice == 2) {
			RegisterView rv = new RegisterView();
			rv.travel();
		}
		if(choice==3) {
			LoginView lv = new LoginView();
			lv.travel();
		}
		if(choice==4) {
			LoginView lv = new LoginView();
			lv.travel();
		}
		
	}
}
