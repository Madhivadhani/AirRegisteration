package com.airticketbooking.user.register;

public interface RegisterModelCallBack {
	public boolean addUserDB(String userName, String email, String phone, String password);
}
