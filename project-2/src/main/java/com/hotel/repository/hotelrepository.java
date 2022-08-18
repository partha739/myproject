package com.hotel.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.model.Employee;

@Repository
public interface hotelrepository extends JpaRepository<Employee, Long>{

}
