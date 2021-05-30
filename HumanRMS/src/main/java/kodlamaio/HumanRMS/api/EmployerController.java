package kodlamaio.HumanRMS.api;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HumanRMS.entities.concrete.Employer;
import kodlamaio.HumanRMS.business.abstracts.Employer.EmployerService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {
	private EmployerService employerService;
	
	public EmployerController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
		
	}
	
	@PostMapping("/registration")
	public Result registration(Employer employer) throws RemoteException{
		return this.employerService.registration(employer);
		
	}
 }
