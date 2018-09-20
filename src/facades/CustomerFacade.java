package facades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.Date;

import DAO.CouponDBDAO;
import DAO.CustomerDBDAO;
import beans.Coupon;
import beans.CouponType;
import beans.Customer;
import exceptions.CouponSystemException;


public class CustomerFacade {
	
	private Customer customer;

	public CustomerFacade(Customer customer) {
		super();
		this.customer = customer;
	}


	public void purchaseCoupon(Coupon coupon) throws CouponSystemException {
		CouponDBDAO coupdao = new CouponDBDAO();
		CustomerDBDAO cusdao = new CustomerDBDAO();
		Coupon tempcoupon = coupdao.getCoupon(coupon.getId());
		System.out.println(tempcoupon);
		if (tempcoupon.getAmount() == 0) {
		   throw new CouponSystemException("Sorry dont have coupons");
		}
		
		if (tempcoupon == null) {
			throw new CouponSystemException("This coupon does not exist");
		}
		
		cusdao.updateCustomerCoupon(this.customer, coupon);
		tempcoupon.setAmount(tempcoupon.getAmount()-1);
		coupdao.updateCoupon(tempcoupon);
	}
	
	public Collection<Coupon> gelAllCouponByType(CouponType type) throws CouponSystemException {
		CustomerDBDAO cusdao = new CustomerDBDAO();
		Collection<Coupon> allCoupons = new ArrayList<Coupon>();
		Collection<Coupon> tempallCoupons = new ArrayList<Coupon>();
		try {
			tempallCoupons.addAll(cusdao.getCouponsByCustomer(this.customer));
			for (Coupon coup : tempallCoupons) {
				if(coup.getType().equals(type)) {
					allCoupons.add(coup);
				}
			}
			
		} catch (Exception e) {
			throw new CouponSystemException("getAllCouponBytype function error", e);
		}
			
		return allCoupons;
		
	}
	
	public Collection<Coupon> gelAllCouponByPrice(double price) throws CouponSystemException {
		CustomerDBDAO cusdao = new CustomerDBDAO();
		Collection<Coupon> allCoupons = new ArrayList<Coupon>();
		Collection<Coupon> tempallCoupons = new ArrayList<Coupon>();
		try {
			tempallCoupons.addAll(cusdao.getCouponsByCustomer(this.customer));
			for (Coupon coup : tempallCoupons) {
				if(coup.getPrice() <= price) {
					allCoupons.add(coup);
				}
			}
			
		} catch (Exception e) {
			throw new CouponSystemException("getAllCouponByPrice function error", e);
		}
			
		return allCoupons;
		
	}
	
	public Collection<Coupon> gelAllCouponByEndDate(Date endDate) throws CouponSystemException {
		CustomerDBDAO cusdao = new CustomerDBDAO();
		Collection<Coupon> allCoupons = new ArrayList<Coupon>();
		Collection<Coupon> tempallCoupons = new ArrayList<Coupon>();
		try {
			tempallCoupons.addAll(cusdao.getCouponsByCustomer(this.customer));
			for (Coupon coup : tempallCoupons) {
				if(coup.getEndDate().compareTo(endDate) < 0) {
					allCoupons.add(coup);
				}
			}
			
		} catch (Exception e) {
			throw new CouponSystemException("getAllCouponByEndDate function error", e);
		}
			
		return allCoupons;
		
	}

}
