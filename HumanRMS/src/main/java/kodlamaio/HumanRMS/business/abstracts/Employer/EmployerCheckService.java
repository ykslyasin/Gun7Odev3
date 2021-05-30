package kodlamaio.HumanRMS.business.abstracts.Employer;

import java.rmi.RemoteException;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employer;

public interface EmployerCheckService {
	public Result checkUser(Employer employer) throws RemoteException;
}
