package kodlamaio.HumanRMS.business.abstracts.Employee;

import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employees;

public interface EmployeeExistCheckService {
	public Result checkEmployee(Employees employees);
}
