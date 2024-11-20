package com.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Scanner_preparstmt {
	
	public void insertdata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");


		PreparedStatement ps = c.prepareStatement("insert into stud values(?,?,?)");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your ID");
		int s1 = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String s2 = sc.next();
		
		System.out.println("Enter Your Age");
		int s3 = sc.nextInt();
		
		ps.setInt(1, s1);
		ps.setString(2, s2);
		ps.setInt(3, s3);
		
		ps.executeUpdate();

		System.out.println("data is inserted");

	//	c.close();
		
	}
	
public void updatedata() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");


		PreparedStatement ps = c.prepareStatement("update stud set age=? where id=?");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your Age to Updated ");
		int s1 = sc.nextInt();
		
		System.out.println("Enter Your ID");
		int s2 = sc.nextInt();
		
		ps.setInt(1, s1);
		ps.setInt(2, s2);
		
		ps.executeUpdate();

		System.out.println("data is updated");

	//	c.close();
		
	}

public void deletedata() throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");


	PreparedStatement ps = c.prepareStatement("delete from stud where id=?");
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print(":Enter ID to Be Deleted");
	int s1 = sc.nextInt();
	
	ps.setInt(1, s1);

	ps.executeUpdate();

	System.out.println("data is delted");

//	c.close();
	
}
	
public void fetchdata() throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");

	PreparedStatement ps = c.prepareStatement("select * from stud;");

	ResultSet rs = ps.executeQuery();
	
	System.out.println("Fetching... \n");

	while (rs.next()) {

		System.out.println("stud ID:" + rs.getInt(1) + " Name:" + rs.getString(2) + " Age:" + rs.getInt(3));
	}
//	c.close();
	
}

public static void main(String[] args) throws Exception {
	

	Scanner_preparstmt pst = new Scanner_preparstmt();
	// pst.insertdata();
	// pst.updatedata();
	// pst.deletedata();
	pst.fetchdata();
	
}

}
