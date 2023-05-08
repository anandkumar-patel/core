package anand.learn.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	private Connection connection;
	private Statement statement;

	public EmployeeDAO() { }

	public Employee getEmployee(int employeeId) throws SQLException {
		String query = "SELECT * FROM public.employee WHERE id=" + employeeId;
		ResultSet rs = null;
		Employee employee = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			if(rs.next()){
				employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setDesignation(rs.getString("designation"));
			}
		} 
		finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		return employee;
	}
	
	public List<Employee> getAllEmployees() throws SQLException {
		String query = "SELECT * FROM public.employee";
		List<Employee> list = new ArrayList<Employee>();
		Employee employee = null;
		ResultSet rs = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				employee = new Employee();
				/*Retrieve one employee details 
				and store it in employee object*/
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setDesignation(rs.getString("designation"));

				//add each employee to the list
				list.add(employee);
			}
		} finally {
			DbUtil.close(rs);
			DbUtil.close(statement);
			DbUtil.close(connection);
		}
		return list;
	}
}

