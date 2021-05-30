package kodlamaio.HumanRMS.business.abstracts.Employer;

import kodlamaio.HumanRMS.entities.concrete.Employer;

public interface EmployerEmailVerificationService {
	public void verificationMail(Employer employer);
}
