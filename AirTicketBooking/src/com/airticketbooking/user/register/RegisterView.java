package com.airticketbooking.user.register;
import java.util.Scanner;

import com.airticketbooking.user.login.LoginView;

import java.util.Scanner;

	public class RegisterView implements RegisterViewCallBack {
		private RegisterControllerCallBack controllerback;
		public RegisterView() {
			controllerback = new RegisterController(this);
		}
		private Scanner sc = new Scanner(System.in);
		
		public  void travel() {
			RegisterView registerView = new RegisterView();
			registerView.getUserDetails();
		}
		public void getUserDetails() {
			System.out.println("Enter user name: ");
			String username = sc.nextLine();
			System.out.println("Enter email ID");
			String email = sc.nextLine();
			System.out.println("Enter Mobile number");
			String mobile = sc.nextLine();
			System.out.println("Set Password");
			String password = sc.nextLine();
			
			controllerback.getUser(username, email, mobile, password);
	
		}
		public void regSuccess() {
			//System.out.println("Successfully Registered");
			LoginView login= new LoginView();
			login.travel();
		}
		public void regFail() {
			System.out.println("Sorry! Unable to register");
		}
}
