package kodlamaio.HumanRMS.business.concrete.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Employee.EmployeeExistCheckService;
import kodlamaio.HumanRMS.core.utilities.results.ErrorResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HumanRMS.entities.concrete.Employees;

@Service
public class EmployeeExistCheckManager implements EmployeeExistCheckService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeExistCheckManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	public Result checkEmployee(Employees employees) {
		if(this.employeeDao.existingEmployee(employees.getNationalId(), employees.getEMail())) {
			return new ErrorResult("National Identity or E-mail are already exists");
		}
		
		return new SuccessResult();
	}

}
