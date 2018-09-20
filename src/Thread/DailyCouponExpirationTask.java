package Thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import beans.Coupon;
import exceptions.CouponSystemException;
import DAO.CouponDBDAO;

public class DailyCouponExpirationTask implements Runnable {

	@Override
	public void run() {
		Date date = new Date();
		CouponDBDAO cupdao = new CouponDBDAO();
		Collection<Coupon> coupons = new ArrayList<Coupon>();
		try {
			coupons.addAll(cupdao.getAllCoupons());
			for(Coupon c : coupons) {
				if(c.getEndDate().compareTo(date) >= 0) {
					cupdao.removeCoupon(c);
				}
			}
		} catch (CouponSystemException e) {
			System.out.println("Thread error");
			
		}
		
	}

	

}
