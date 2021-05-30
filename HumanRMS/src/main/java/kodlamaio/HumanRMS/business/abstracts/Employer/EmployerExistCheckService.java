package kodlamaio.HumanRMS.business.abstracts.Employer;

import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employer;

public interface EmployerExistCheckService {
	public Result checkEmployer(Employer employer);
}
