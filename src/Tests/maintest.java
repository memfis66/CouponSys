package Tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import DataBase.CreateTables;
import beans.Company;
import beans.Coupon;
import beans.CouponType;
import beans.Customer;
import facades.AdminFacade;
import facades.CompanyFacade;
import facades.CustomerFacade;

public class maintest {
	
	public static void main(String[] args) throws Exception {
		
		//CreateTables.CreateAllTables();
	
		Company com1 = new Company(1, "RogaiKopita", "123456", "rig@gmail.com");
		Company com2 = new Company(2, "OOO", "1234", "ooo@gmail.com");
		Company com3 = new Company(3, "AAA", "456", "aaa@gmail.com");
		
		Customer cus1 = new Customer(1, "john", "jo123");
		Customer cus2 = new Customer(2, "serega", "seriy");
		Customer cus3 = new Customer(3, "masha", "masha");
		
		Coupon cup1 = new Coupon(1, "GreatSale", java.sql.Date.valueOf("2018-9-20"), java.sql.Date.valueOf("2019-9-25"), 7, CouponType.FOOD, "Your lucky!", 250, "Greatpic");
		Coupon cup2 = new Coupon(2, "GreatSale1", java.sql.Date.valueOf("2018-9-20"), java.sql.Date.valueOf("2019-9-30"), 7, CouponType.CAMPING, "Your lucky too!", 300, "pic");
		Coupon cup3 = new Coupon(3, "GreatSale2", java.sql.Date.valueOf("2018-9-20"), java.sql.Date.valueOf("2019-10-25"), 7, CouponType.SPORTS, "Your dont lucky!", 1000, "Greatpic");
		Coupon cup4 = new Coupon(4, "GreatSale3", java.sql.Date.valueOf("2018-9-20"), java.sql.Date.valueOf("2019-11-25"), 7, CouponType.ELECTRICITY, "Your f**ing lucky!", 50, "Greatpic");
		
		AdminFacade adside = new AdminFacade();
		
//		adside.createCompany(com1);
//		adside.createCompany(com2);
//		adside.createCompany(com3);
//		System.out.println(adside.getAllCompanies());
		
//		adside.createCustomer(cus1);
//		adside.createCustomer(cus2);
//		adside.createCustomer(cus3);
//		System.out.println(adside.getAllCustomers());
		
		CompanyFacade comside = new CompanyFacade(com1);
		
		//comside.createCoupon(cup1);
		//comside.createCoupon(cup2);
		//System.out.println(comside.getAllCoupons());
		
		
       CompanyFacade comside1 = new CompanyFacade(com2);
		
		//comside1.createCoupon(cup3);
		//comside1.createCoupon(cup4);
		//System.out.println(comside1.getAllCoupons());
       
       CustomerFacade cusside = new CustomerFacade(cus1);
       cusside.purchaseCoupon(cup1);
       //System.out.println(cup1.getEndDate());
       
	}

}
