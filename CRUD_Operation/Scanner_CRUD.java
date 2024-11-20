package com.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Scanner_CRUD {
	
	public static void main(String[] args) throws Exception  {
		
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
	
}
