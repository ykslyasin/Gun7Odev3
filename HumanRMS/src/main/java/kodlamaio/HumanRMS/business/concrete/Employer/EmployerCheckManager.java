package kodlamaio.HumanRMS.business.concrete.Employer;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Employer.EmployerCheckService;
import kodlamaio.HumanRMS.business.abstracts.Employer.EmployerExistCheckService;
import kodlamaio.HumanRMS.core.utilities.results.ErrorResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.entities.concrete.Employer;

@Service
public class EmployerCheckManager implements EmployerCheckService{
	
	private EmployerExistCheckService employerExistCheckService;

	@Autowired
	public EmployerCheckManager(EmployerExistCheckService employerExistCheckService) {
		super();
		this.employerExistCheckService = employerExistCheckService;
	}

	@Override
	public Result checkUser(Employer employer) throws RemoteException {
		if(!employerExistCheckService.checkEmployer(employer).isSuccess()) {
					return new SuccessResult();
				}
				return new ErrorResult("Invalid user information");
	}
	
	

}
