package com.airticketbooking.user.cancelFlight;

import com.airticketbooking.repositary.AirTicketDB;

public class CancelModel implements CancelModelCallBack {
	CancelControllerCallBack controllerback;
	public CancelModel(CancelControllerCallBack cancelController) {
		// TODO Auto-generated constructor stub
		controllerback =cancelController;
	}

	public boolean cancelTicketDB(int id) {
		if(AirTicketDB.getInstance().cancelTicketDB(id)) {
			return true;
		}
		return false;
	}

}
