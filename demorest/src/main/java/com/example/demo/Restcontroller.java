package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Restcontroller {
	@GetMapping("/employee")
	public List<Employeedet> getEmployeedet()
	{
		List<Employeedet> employee=new ArrayList<>();
		employee.add(new Employeedet("praveen","raj",1) );
		employee.add(new Employeedet("ram","charan",2));
		employee.add(new Employeedet("pradeep","raja",3));
		
		return employee;
		
	}

}
