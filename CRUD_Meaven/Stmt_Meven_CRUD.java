package com.CRUD_Meaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Stmt_Meven_CRUD {

	String url = "jdbc:mysql://localhost:3306/db4";
	String username = "root";
	String password = "root";

	public void createtable() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection(url, username, password);

		Statement s = c.createStatement();

		s.execute("create table Staff(id int primary key,name varchar(20),salary int)");

		System.out.println("table is created");

	}

	public void insertdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");

		Statement s = c.createStatement();

		s.executeUpdate("insert into Staff values(5,'surekha',56000)");

		System.out.println("data is inserted");

		c.close();

	}

	public void updatedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");

		Statement s = c.createStatement();

		s.executeUpdate("update Staff set salary=40000 where id=2");

		System.out.println("data is updated");

		c.close();

	}

	public void deletedata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");

		Statement s = c.createStatement();

		s.executeUpdate("delete from Staff where name='surekha' ");

		System.out.println("data is deleted");

		c.close();

	}

	public void fetchdata() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");

		Statement s = c.createStatement();

		ResultSet rs = s.executeQuery("select * from Staff;");

		while (rs.next()) {

			System.out.println("staff ID:" + rs.getInt(1) + " Name:" + rs.getString(2) + " Salary:" + rs.getInt(3));
		}

	}

	public static void main(String[] args) throws Exception {

		Stmt_Meven_CRUD smc = new Stmt_Meven_CRUD();
		// smc.createtable();
		// smc.insertdata();
		// smc.updatedata();
		// smc.deletedata();
		smc.fetchdata();

	}

}
