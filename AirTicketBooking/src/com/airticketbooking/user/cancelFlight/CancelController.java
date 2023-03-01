package com.airticketbooking.user.cancelFlight;

public class CancelController implements CancelControllerCallBack{
	CancelViewCallBack viewback;
	CancelModelCallBack modelback;
	
	public CancelController(CancelViewCallBack cancelView) {
		// TODO Auto-generated constructor stub
		this.viewback = cancelView;
		this.modelback = new CancelModel(this);
	}

	public void getID(int id) {
		if(modelback.cancelTicketDB(id)) {
			viewback.cancelSuccess();
		}
		else {
			viewback.cancelFailed();
		}
	}
}
