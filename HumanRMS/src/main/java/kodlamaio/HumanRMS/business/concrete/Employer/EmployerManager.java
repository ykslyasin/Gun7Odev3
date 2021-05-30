package kodlamaio.HumanRMS.business.concrete.Employer;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Employer.EmployerService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.ErrorResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HumanRMS.entities.concrete.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private EmployerCheckManager employerCheckManager;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao , EmployerCheckManager employerCheckManager) {
		super();
		this.employerDao = employerDao;
		this.employerCheckManager = employerCheckManager;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll() , "Data listed");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Employer added to system\n");
	}

	@Override
	public Result registration(Employer employer) throws RemoteException {
		if(employerCheckManager.checkUser(employer).isSuccess()) {
			add(employer);
			return new SuccessResult("Registration successful");
		}
		return new ErrorResult("Registraion Failed");
	}

}
