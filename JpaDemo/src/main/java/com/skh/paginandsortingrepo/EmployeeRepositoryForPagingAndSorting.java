package com.skh.paginandsortingrepo;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skh.Employee;

@Repository
public interface EmployeeRepositoryForPagingAndSorting extends PagingAndSortingRepository<Employee, Integer> {

	//List<Employee> findTop10ByLastname(String lastname, Pageable pageable);
	
}