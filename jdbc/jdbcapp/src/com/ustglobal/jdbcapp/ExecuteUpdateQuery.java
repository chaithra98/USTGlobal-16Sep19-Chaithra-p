package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		try {
			//step 1 Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);		

			//Step 3 Issue SQL Query
			String sql = "update employee_info set name=?, sal=?, gender=? where id=?";
			// "update employee_info set name='ABC',sal=50,gender='O' where id=6";
			//stmt = conn.createStatement();
			//int count = stmt.executeUpdate(sql);
			pstmt = conn.prepareStatement(sql);
		
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			
			String gender = args[3];
			
			pstmt.setInt(4, id);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			
			// Step 4 Read the Result
			System.out.println(count +" row(s) updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//Step 5 close all JDBC Objects
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}
}
