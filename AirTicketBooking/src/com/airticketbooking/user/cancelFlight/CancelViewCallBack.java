package com.airticketbooking.user.cancelFlight;

public interface CancelViewCallBack {
	public void cancelDisplay();
	void cancelSuccess();
	void cancelFailed();
	void cancel();
}
