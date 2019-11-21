package com.ustglobal.empapp.dao;

import java.util.ArrayList;

import com.ustglobal.empapp.dto.EmployeeBean;

// interface
public interface EmployeeDAO {
	public ArrayList<EmployeeBean> getAllEmployeeData();
	
	public EmployeeBean searchEmployeeData(int id);
	
	public int insertEmployeeData(EmployeeBean bean);
	
	public int updateEmployeeData(EmployeeBean bean, int id);
	
	public int deleteEmployeeData(int id);

}
