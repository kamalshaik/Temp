package com.skh;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRC {

	@Autowired
	private EmployeeRepository repo;

	@GetMapping("/save")
	public Employee storeNewEmployee() {
		Employee e = new Employee(3, "Kamal", 23d, new Date(), true);

//		System.out.println(repo.findByIdNamedQueryXXXXX(212));
		//System.out.println(repo.findByNameEndsWith("2"));
//		System.out.println(repo.findByAndSort("lannister", new Sort("name")));
		System.out.println(repo.findByLastnameOrFirstname("A2"));
		
		
		
		
		
		
		
		
		
//		Employee emp = repo.save(e);

		/*
		 * Iterable<Employee> findAll = repo.findAll(); for (Employee employee :
		 * findAll) { System.out.println(employee); e = employee; }
		 */

		/*
		 * long count = repo.count(); System.out.println("Count : "+ count);
		 */

		/*
		 * Optional<Employee> findById = repo.findById(2); System.out.println(findById);
		 * Optional<Dog> optionalDog = repository.findById(id); return
		 * optionalDog.orElseThrow(() -> new
		 * DogNotFoundException("Couldn't find a Dog with id: " + id));
		 */

		/*
		 * boolean existsById = repo.existsById(5); System.out.println(existsById);
		 */
		Optional<Employee> findById = repo.findById(25);
		findById.isPresent();
		if (!findById.isPresent()) {
			System.out.println("No Record Found!");
		} else {
			repo.deleteById(25);
		}

		List<Employee> list = repo.findByName("Kamal");
		return e;
	}

}
