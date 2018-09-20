package system;

import exceptions.CouponSystemException;

public class CouponSystem {
	
private static CouponSystem instance;
	
	public static CouponSystem getInstance() throws CouponSystemException {
		if (instance == null) {
			instance = new CouponSystem();
		}
		return instance;
	}

}
