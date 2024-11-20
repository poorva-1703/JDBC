package com.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Crub_queries {

	public void insertdata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");

		Statement s = c.createStatement();
		
		s.executeUpdate("insert into stud values(4,'Pradnya',22)");
		
		System.out.println("data is inserted");

		c.close();
		
	}

	public void updatedata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");

		Statement s = c.createStatement();
	
	s.executeUpdate("update stud set name='Poonam' where id=1");
		
	System.out.println("data is updated");

		c.close();


	}

	public void deletedata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");

		Statement s = c.createStatement();
	
	s.executeUpdate("delete from stud where name='Poonam' ");
		
	System.out.println("data is deleted");

		c.close();

	}
	
	public void fetchdata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");

		Statement s = c.createStatement();
	
	ResultSet rs = s.executeQuery("select * from stud;");
	
	while (rs.next()) {
		
		System.out.println("stud ID:"+rs.getInt(1)+" Name:"+rs.getString(2)+" Age:"+rs.getInt(3));	
	}
		
	c.close();
		
	}


}
