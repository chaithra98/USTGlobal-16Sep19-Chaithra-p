package com.ustglobal.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {

		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to select single employee data");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch) {
		case 1:
			/*EmployeeDAOImpl impl = new EmployeeDAOImpl();
			List<EmployeeBean> result = impl.getAllEmployeeData();*/
			
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for(EmployeeBean bean : result) {
				System.out.println("Name : "+bean.getName());
				System.out.println("ID : "+bean.getId());
				System.out.println("Gender : "+bean.getGender());
				System.out.println("Salary : "+bean.getSal());
				System.out.println("*****************");
			}
			
			break;
		case 2 :
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean1 = new EmployeeBean();
			
			System.out.println("Enter the Id");
			bean1.setId(sc.nextInt());
			System.out.println("Enter the name");
			bean1.setName(sc.next());
			System.out.println("Enter the Salary");
			bean1.setSal(sc.nextInt());
			System.out.println("Enter the Gender");
			bean1.setGender(sc.next());
			
			int count2 = dao2.insertEmployeeData(bean1);
			System.out.println(count2+" row(s) affected");
			break;
		case 3 :
			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			EmployeeBean bean3 = new EmployeeBean();
		
			System.out.println("Enter the ID you want to make the changes");
			int id3 = sc.nextInt();
			
			System.out.println("Enter the new name");
			bean3.setName(sc.next());
			
			System.out.println("Enter the new salary");
			bean3.setSal(sc.nextInt());
			
			System.out.println("Enter the gender");
			bean3.setGender(sc.next());
			
			int count3 = dao3.updateEmployeeData(bean3,id3);
			
			System.out.println(count3+ " row(s) affected");
			break;
		case 4 :
			EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter the id you want to delete");
			int id2 = sc.nextInt();
			int count = dao4.deleteEmployeeData(id2);
			System.out.println(count+" row(s) affected");
			break;
		case 5 :
//			EmployeeDAOImpl impl5 = new EmployeeDAOImpl();
			
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			 
			System.out.println("Enter the ID you want to search");
			int id = sc.nextInt();
			
//			 EmployeeBean bean = impl5.searchEmployeeData(id);
			EmployeeBean bean = dao5.searchEmployeeData(id);
			
			if(bean != null) {
				System.out.println("Name : "+bean.getName());
				System.out.println("ID : "+bean.getId());
				System.out.println("Gender : "+bean.getGender());
				System.out.println("Salary : "+bean.getSal());
				System.out.println("*****************");
			} else {
				System.out.println("No data found");
			}
			 break;
			
		} // end of switch
	} // end of main()
}
