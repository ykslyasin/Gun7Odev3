package kodlamaio.HumanRMS.business.concrete.Employer;

import kodlamaio.HumanRMS.business.abstracts.Employer.EmployerEmailVerificationService;
import kodlamaio.HumanRMS.entities.concrete.Employer;

public class EmployerEmailVerificationManager implements EmployerEmailVerificationService{

	@Override
	public void verificationMail(Employer employer) {
		System.out.println("Verification mail sent. Your e-mail verified.");
	}

}
