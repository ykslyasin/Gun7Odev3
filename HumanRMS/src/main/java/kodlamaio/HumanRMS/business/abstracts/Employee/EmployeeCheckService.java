package kodlamaio.HumanRMS.business.abstracts.Employee;

import java.rmi.RemoteException;

import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employees;

public interface EmployeeCheckService{
	public Result checkUser(Employees employees) throws RemoteException;
}
