package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PreparedStatementExample  {
	public static void main(String[] args) throws SQLException {
		Product pd = new Product("Shoes", 5500f, true);
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/durshikshya";
		String user = "root";
		String pass = "4311DA3068";
		String query = "insert into product(name, price, active) values(?,?,?)";
	
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1,pd.getName());
		pstm.setFloat(2, pd.getPrice());
		pstm.setBoolean(3, pd.isActive());
		int i = pstm.executeUpdate();
		if(i==0) {
			System.out.println("Insert Failed!");
		}
		else {
			System.out.println("Product inserted into databases");
		}
		pstm.close();
		con.close();
		
	}

}
