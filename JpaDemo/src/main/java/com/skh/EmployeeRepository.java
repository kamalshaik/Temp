package com.skh;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	List<Employee> findByName(String name);
	void deleteById(Integer id);
	
	List<Employee> findByIdNamedQueryXXXXX(Integer id);
	
	@Query("select u from Employee u where u.name like %?1")
	  List<Employee> findByNameEndsWith(String firstname);
	
	
	@Query("select u from Employee u where u.name = :firstname")
	Employee findByLastnameOrFirstname(@Param("firstname") String firstname);
	
	
	
	
	
	
	
	
	
	
	
	
	/*Not working below one..
	 * @Query("select u from Employee u where u.name like ?1%") List<Employee>
	 * findByAndSort(String lastname, Sort sort);
	 */	 
}
