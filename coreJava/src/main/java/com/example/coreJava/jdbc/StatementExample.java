package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Product pd = new Product("Trousers", 3500f, true);
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/durshikshya";
		String user = "root";
		String pass = "4311DA3068";
		String query = "insert into product(name, price, active) values(' "+
						pd.getName()+" ' ,"+
						pd.getPrice()+","+
						pd.isActive()+")";
		//Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		if(i==0) {
			System.out.println("Insert Failed!");
		}
		else {
			System.out.println("Product inserted into databases");
		}
		stm.close();
		con.close();
	}

}
