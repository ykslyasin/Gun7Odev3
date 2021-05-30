package kodlamaio.HumanRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanRMS.entities.concrete.Administrators;

public interface AdministratorsDao extends JpaRepository<Administrators, Integer>{

}
