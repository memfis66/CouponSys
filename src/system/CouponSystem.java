package system;

import exceptions.CouponSystemException;
import facades.AdminFacade;
import facades.CouponClientFacade;

public class CouponSystem {
	
private static CouponSystem instance;
	
	public static CouponSystem getInstance() throws CouponSystemException {
		if (instance == null) {
			instance = new CouponSystem();
		}
		return instance;
	}

	private CouponSystem() {

		// TODO Auto-generated constructor stub
	}
	
	
	public CouponClientFacade login(String username, String password, CouponClientFacade clientType)
			throws CouponSystemException {

		CouponClientFacade facade = null;

		if (clientType == (CouponClientFacade.ADMIN)) {
			
		}

		if (clientType == (CouponClientFacade.COMPANY)) {
			
		}

		if (clientType == (CouponClientFacade.CUSTOMER)) {
			
		}
		
		throw new CouponSystemException("Wrong client type");

	}
	

}
