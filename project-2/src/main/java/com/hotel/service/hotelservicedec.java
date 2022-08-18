package com.hotel.service;



import java.util.List;

import org.springframework.data.domain.Page;

import com.hotel.model.Employee;

public interface hotelservicedec {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}