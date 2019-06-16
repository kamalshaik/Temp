package com.skh.paginandsortingrepo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skh.Employee;

@RestController
public class PagingAndSortingRestController {
//	@Autowired
	//  private EmployeeRepositoryForPagingAndSorting repo;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/saveRepo")
	  public void run() {
		

		
		
		
		
		
		
		
		
		/*
		 * System.out.println(" -- finding all employees sorted by names --");
		 * Iterable<Employee> all = repo.findAll(Sort.by("name"));
		 * all.forEach(System.out::println);
		 */
		//System.out.println(" -- paginate employees sorted by salaries  --");
	    //  PageRequest pageable = PageRequest.of(0, 3,Sort.by("salary").descending());
		
	      
//	          pageable = page.nextPageable();
		
		
		
		
		
		/*
		 * List<Employee> employees = createEmployees(); repo.saveAll(employees);
		 */

	      }
	
	  private List<Employee> createEmployees() {
	      return Arrays.asList(
	    		  new Employee(1, "A1", 1d, new Date(), true),
	    		  new Employee(2, "A2", 2d, new Date(), false),
	    		  new Employee(3, "A3", 3d, new Date(), true),
	    		  new Employee(4, "A4", 4d, new Date(), false),
	    		  new Employee(5, "A5", 5d, new Date(), true),
	    		  new Employee(6, "A6", 6d, new Date(), false),
	    		  new Employee(7, "A7", 7d, new Date(), false),
	    		  new Employee(8, "A8", 8d, new Date(), false),
	    		  new Employee(9, "A9", 9d, new Date(), true)   		  
	             
	      );
	  }

}
