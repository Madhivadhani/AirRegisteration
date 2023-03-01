package com.airticketbooking.user.register;

public class RegisterController implements RegisterControllerCallBack {
	
	private RegisterViewCallBack viewback ;
	private RegisterModelCallBack  modelback;
	
   public RegisterController(RegisterView registerView) {
		// TODO Auto-generated constructor stub
	   this.viewback = registerView;
	   this.modelback = new RegisterModel(this);
	}

   public void getUser(String userName, String email, String phone, String password) {
	   if(modelback.addUserDB(userName, email, phone, password)) {
		   viewback.regSuccess();
	   }
	   else {
		   viewback.regFail();
	   }
   }
}
