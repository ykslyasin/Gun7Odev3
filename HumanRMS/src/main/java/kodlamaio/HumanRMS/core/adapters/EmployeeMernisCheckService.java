package kodlamaio.HumanRMS.core.adapters;

import java.rmi.RemoteException;

import kodlamaio.HumanRMS.entities.concrete.Employees;


public interface EmployeeMernisCheckService {
	boolean CheckIfRealPerson(Employees employees) throws RemoteException;
}
