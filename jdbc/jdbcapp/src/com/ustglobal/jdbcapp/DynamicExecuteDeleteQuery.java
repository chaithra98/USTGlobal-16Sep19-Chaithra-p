package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


//import com.mysql.jdbc.Driver;	// no need.... because we are not using DriverManager


public class DynamicExecuteDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// Step 1 Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			/*Driver driver = new Driver();
			DriverManager.registerDriver(driver); // not required.. instead of this we are using forName(*/
			
			
			//Step 2 Get the Connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			// Step 3 issue a query
			String sql = "delete from employee_info where id=?";
			pstmt = conn.prepareStatement(sql);

			//			String empid = args[0];
			//			int id = Integer.parseInt(empid);

			//			int id = Integer.parseInt(args[0]);

			//			pstmt.setInt(1, id);		//we can write in one line... see below line.

			pstmt.setInt(1, Integer.parseInt(args[0]));

			int count = pstmt.executeUpdate();

			// Step 4 Read the Result
			System.out.println(count + " row(s) affected");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
