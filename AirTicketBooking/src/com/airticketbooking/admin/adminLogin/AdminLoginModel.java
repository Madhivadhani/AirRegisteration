package com.airticketbooking.admin.adminLogin;

import com.airticketbooking.repositary.AirTicketDB;

public class AdminLoginModel implements AdminLoginModelCallBack{
	private AdminLoginControlViewCallBack admincontrolcall;
	
	public AdminLoginModel(AdminLoginControl adminLoginControl) {
		this.admincontrolcall = adminLoginControl;
	}

	public boolean isAdmin(String aUsername,String aPassword) {
		if(AirTicketDB.getInstance().isValidAdmin(aUsername, aPassword)) {
			return true;
		}
		return false;
	}

}
