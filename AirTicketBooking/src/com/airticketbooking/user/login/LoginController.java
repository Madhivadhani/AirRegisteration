 package com.airticketbooking.user.login;

public class LoginController implements LoginControllerCallBack {
	
	private LoginViewCallBack viewback ;
	private LoginModelCallBack modelback;
	
	public LoginController(LoginViewCallBack loginView) {
		this.viewback = loginView;
		this.modelback = new LoginModel(this);
	}

	public void checkCredential(String username,String password) {
		if(modelback.isCredentialValid(username, password)) {
			viewback.loginSuccess();
		}
		else {
			viewback.loginFail();
		}
	}

}
