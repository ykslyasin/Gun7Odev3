package kodlamaio.HumanRMS.core.adapters;

import java.rmi.RemoteException;
import kodlamaio.HumanRMS.entities.concrete.Employees;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EmployeeMernisServiceAdapter implements EmployeeMernisCheckService{

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Employees employees) throws RemoteException {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(employees.getNationalId() , 
									   employees.getFirstName() , 
									   employees.getLastName() , 
									   employees.getBirthDate().getYear());
	}



}
