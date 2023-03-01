package com.airticketbooking.admin.adminLogin;

public class AdminLoginControl implements AdminLoginControlViewCallBack{
	
	private AdminLoginViewCallBack adminviewcallback;
	private AdminLoginModelCallBack adminmodelcall;
	public AdminLoginControl(AdminLoginViewCallBack adminLoginView) {
		this.adminviewcallback= adminLoginView;
		this.adminmodelcall = new AdminLoginModel(this);	
	}

	public void checkisAdmin(String aUsername,String aPassword) {
		if(adminmodelcall.isAdmin(aUsername, aPassword)) {
			adminviewcallback.adminSuccess();
		}
		else {
			adminviewcallback.adminFail();
		}
	}

}
