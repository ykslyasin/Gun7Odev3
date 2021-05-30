package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.HumanRMS.entities.concrete.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	boolean existingEmployer(String email);
}
