package com.CRUD_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
                
public class Demo {
	
	public static void main(String[] args) throws Exception {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/db4","root","root");
		
//		Statement s = c.createStatement();
//		
//		s.executeUpdate("insert into stud values(1,'Poorva',22)");
		
//		PreparedStatement ps =c.prepareStatement("update stud set age=24 where id=1");
//	    ps.executeUpdate();                   // type 1 of PreparedStatement
	    
		PreparedStatement ps =c.prepareStatement("update stud set name=? where id=?");
        ps.setString(1, "Pooja");             // type 2 of PreparedStatement
		ps.setInt(2, 1);
	    ps.executeUpdate();

		
		System.out.println("Data Updated");
		
	}
	
	
} 
