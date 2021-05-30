package kodlamaio.HumanRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.Employees;

public interface EmployeeDao extends JpaRepository<Employees, Integer>{
	
	boolean existingEmployee(long nationalId , String email);
}
