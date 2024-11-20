package com.jbk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crub_PreadSTMT {

	public void insertdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");

		PreparedStatement ps = c.prepareStatement("insert into stud values(?,?,?)");

		ps.setInt(1, 5);
		ps.setString(2, "Pournima");
		ps.setInt(3, 24);
		
		ps.executeUpdate();

		System.out.println("data is inserted");

		c.close();

	}

	public void updatedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");

		
		PreparedStatement ps = c.prepareStatement("update stud set name=? where id=?");

		ps.setString(1, "Prathibha");
		ps.setInt(2, 1);
		
		ps.executeUpdate();

		System.out.println("data is updated");

		c.close();

	}

	public void deletedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");

		PreparedStatement ps = c.prepareStatement("delete from stud where age=? ");

		ps.setString(1, "21");
	
		ps.executeUpdate();

		System.out.println("data is deleted");

		c.close();

	}

	public void fetchdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");

		PreparedStatement ps = c.prepareStatement("select * from stud;");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			System.out.println("stud ID:" + rs.getInt(1) + " Name:" + rs.getString(2) + " Age:" + rs.getInt(3));
		}

		c.close();

	}

}
