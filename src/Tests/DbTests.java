package Tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import Connections.ConnectionPool;
import DAO.CompanyDBDAO;
import DAO.CouponDBDAO;
import DAO.CustomerDBDAO;
import DataBase.CreateTables;
import beans.Company;
import beans.Coupon;
import beans.CouponType;
import facades.AdminFacade;

public class DbTests {
	
	public static void main(String[] args) throws Exception {
		
		
	
		//CreateTables.CreateAllTables();
//	Company comp = new Company(1, "ffew", "12345", "dfs@com");
//		AdminFacade fac = new AdminFacade();
//		fac.createCompany(comp);
//	
//		System.out.println();
		//System.out.println("gfhgfwhjfwghj");
//		ConnectionPool cpool = ConnectionPool.getInstance();
//		Connection con = cpool.getConnection();
//		String sql = "DROP TABLE Coupon";
////		Collection<String> creating = new ArrayList<String>();
////		//creating.add("DROP TABLE Company");
////		//creating.add("DROP TABLE Customer");
////		creating.add("DROP TABLE Coupon");
////		creating.add("DROP TABLE Customer_Coupon");
////		creating.add("DROP TABLE Company_Coupon");
//		try {
////			for(String c : creating) {
////				Statement stmt = con.createStatement();
////				stmt.executeUpdate(c);
////				System.out.println(c);
//			Statement stmt = con.createStatement();
//			stmt.executeUpdate(sql);
//			} catch (SQLException e) {
//			e.printStackTrace();	
//		}
//		
//		finally {
//			cpool.returnConnection(con);
//		}
////		
//	CompanyDBDAO comdao = new CompanyDBDAO();
//		Company comp = new Company(2, "ffew", "12345", "dfs@com");
//	comdao.createCompany(comp);
//		System.out.println(comdao.getCompany(2));
//	CouponDBDAO cudao = new CouponDBDAO();
//	Coupon coup1 = new Coupon(1, "OnePlusOne", java.sql.Date.valueOf("2018-6-17"), java.sql.Date.valueOf("2019-6-17"), 20, CouponType.HEALTH, "Thanks", 500, "Image	");
//	
//	CustomerDBDAO cusdao = new CustomerDBDAO();
	
	
				
}
	
}
