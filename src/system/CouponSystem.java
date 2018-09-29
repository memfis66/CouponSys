package system;

import DAO.CompanyDBDAO;
import DAO.CustomerDBDAO;
import Thread.DailyCouponExpirationTask;
import exceptions.CouponSystemException;
import facades.AdminFacade;
import facades.CompanyFacade;
import facades.CouponClientFacade;
import facades.CustomerFacade;

public class CouponSystem {
	
	DailyCouponExpirationTask dailytask = new DailyCouponExpirationTask();
	Thread dailyThread = new Thread(dailytask);
	
private static CouponSystem instance;
	
	public static CouponSystem getInstance() throws CouponSystemException {
		if (instance == null) {
			instance = new CouponSystem();
		}
		return instance;
	}

	private CouponSystem() {
		
		dailyThread.start();

	}
	
	CompanyDBDAO comdao = new CompanyDBDAO();
	CustomerDBDAO cusdao = new CustomerDBDAO();
	
	
	public CouponClientFacade login(String username, String password, CouponClientFacade clientType)
			throws CouponSystemException {


		if (clientType == (CouponClientFacade.ADMIN)) {
			AdminFacade adside = new AdminFacade();
			adside.Login(username, password);
			
		}

		if (clientType == (CouponClientFacade.COMPANY)) {
			CompanyFacade comside = new CompanyFacade(comdao.getCompany(username));
			comside.login(username, password);
		}

		if (clientType == (CouponClientFacade.CUSTOMER)) {
			CustomerFacade cusside = new CustomerFacade(cusdao.getCustomer(username));
			cusside.login(username, password);
		}
		
		throw new CouponSystemException("Wrong client type");

	}
	

}
