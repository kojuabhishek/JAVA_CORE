package com.example.coreJava.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;




public abstract class AbstractDao<T> implements DAO<T> {
	
	String url = "jdbc:mysql://localhost:3306/durshikshya";
	String user = "root";
	String pass ="4311DA3068";
	Connection con;
	

	@Override
	public void connect() throws SQLException {
		// TODO Auto-generated method stub
		con = DriverManager.getConnection(url,user,pass);
		
	}

	@Override
	public void disconnect() throws SQLException {
		// TODO Auto-generated method stub
		con.close();
		
		
	}

	@Override
	public int save(T t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getOne(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(T t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
