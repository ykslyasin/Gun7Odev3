package kodlamaio.HumanRMS.business.concrete.Employer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Employer.EmployerExistCheckService;
import kodlamaio.HumanRMS.core.utilities.results.ErrorResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.EmployerDao;
import kodlamaio.HumanRMS.entities.concrete.Employer;

@Service
public class EmployerExistCheckManager implements EmployerExistCheckService{
	
	private EmployerDao employerDao;
	

	@Autowired
	public EmployerExistCheckManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}



	@Override
	public Result checkEmployer(Employer employer) {
		if(this.employerDao.existingEmployer(employer.getEMail())) {
			return new ErrorResult("E-mail are already exists");
		}
		
		return new SuccessResult();
	}

}
