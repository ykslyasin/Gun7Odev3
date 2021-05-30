package kodlamaio.HumanRMS.business.concrete.Employee;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Employee.EmployeeCheckService;
import kodlamaio.HumanRMS.business.abstracts.Employee.EmployeeExistCheckService;
import kodlamaio.HumanRMS.core.adapters.EmployeeMernisCheckService;
import kodlamaio.HumanRMS.core.utilities.results.ErrorResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.entities.concrete.Employees;

@Service
public class EmployeeCheckManager implements EmployeeCheckService{

	private EmployeeExistCheckService employeeExistCheckService;
	private EmployeeMernisCheckService employeeMernisCheckService;
	
	@Autowired
	public EmployeeCheckManager(EmployeeExistCheckService employeeExistCheckService , 
								EmployeeMernisCheckService employeeMernisCheckService) {
		super();
		this.employeeExistCheckService = employeeExistCheckService;
		this.employeeMernisCheckService = employeeMernisCheckService;
	}

	@Override
	public Result checkUser(Employees employees) throws RemoteException {
		if(employeeMernisCheckService.CheckIfRealPerson(employees) && 
		   !employeeExistCheckService.checkEmployee(employees).isSuccess()) {
			return new SuccessResult();
		}
		return new ErrorResult("Invalid user information");
	}
	
	
}
