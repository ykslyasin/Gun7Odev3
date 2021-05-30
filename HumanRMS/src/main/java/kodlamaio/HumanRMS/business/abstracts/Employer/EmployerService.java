package kodlamaio.HumanRMS.business.abstracts.Employer;

import java.rmi.RemoteException;
import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employer;

public interface EmployerService {
	
	DataResult<List<Employer>> getAll();
	
	Result add(Employer employer);
	
	Result registration(Employer employer) throws RemoteException;
}
