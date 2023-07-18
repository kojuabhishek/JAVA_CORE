package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) throws SQLException {
		Product pd = new Product(2,"Jacket", 6500f, true);
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/durshikshya";
		String user = "root";
		String pass = "4311DA3068";
		String query = "update product set name=?, price= ?, active=? where id = ?";
	
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1,pd.getName());
		pstm.setFloat(2, pd.getPrice());
		pstm.setBoolean(3, pd.isActive());
		pstm.setInt(4,pd.getId());
		int i = pstm.executeUpdate();
		if(i==0) {
			System.out.println("Update Failed!");
		}
		else {
			System.out.println("Product updated into databases");
		}
		pstm.close();
		con.close();
		
	}
}
