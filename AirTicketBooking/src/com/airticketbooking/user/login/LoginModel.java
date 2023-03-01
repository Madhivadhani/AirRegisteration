package com.airticketbooking.user.login;

import com.airticketbooking.repositary.AirTicketDB;

public class LoginModel implements LoginModelCallBack {
	LoginControllerCallBack controllerback;
	public LoginModel(LoginControllerCallBack loginController) {
		this.controllerback= loginController;
	}

	public boolean isCredentialValid(String username,String password) {
		return AirTicketDB.getInstance().isValidUser(username, password);
	}
}
