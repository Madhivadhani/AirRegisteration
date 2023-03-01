package com.airticketbooking.user.register;

import com.airticketbooking.repositary.AirTicketDB;
import com.airticketbooking.user.dto.User;

public class RegisterModel implements RegisterModelCallBack {
	
	private RegisterControllerCallBack controllerBack;
	public RegisterModel(RegisterController registerController) {
		this.controllerBack = registerController;
	}

	public boolean addUserDB(String userName, String email, String phone, String password) {
		if(AirTicketDB.getInstance().addUser(userName, email, phone, password)) {
			return true;
		}
		return false;
	}
}
