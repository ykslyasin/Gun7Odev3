package kodlamaio.HumanRMS.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanRMS.business.abstracts.Employee.EmployeeService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Employees;
import kodlamaio.HumanRMS.entities.concrete.cv.Cv;
import kodlamaio.HumanRMS.entities.concrete.cv.EducationStatusCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ExperienceCv;
import kodlamaio.HumanRMS.entities.concrete.cv.ForeignLanguageCv;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employees>> getAll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employees employees) {
		return this.employeeService.add(employees);
	}
	
	@PostMapping("/registration")
	public Result registration(@RequestBody Employees employees) {
		return this.employeeService.registration(employees);
	}
	
	@PostMapping("/addCv")
	public Result addCv(@RequestBody Cv cv , @RequestBody ExperienceCv experienceCv , @RequestBody EducationStatusCv educationStatusCv , @RequestBody ForeignLanguageCv foreignLanguageCv , @RequestBody Employees employees) {
		return this.employeeService.addCv(cv, experienceCv, educationStatusCv, foreignLanguageCv, employees);
	}
}
