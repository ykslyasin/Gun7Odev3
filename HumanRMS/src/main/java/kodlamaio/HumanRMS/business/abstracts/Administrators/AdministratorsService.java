package kodlamaio.HumanRMS.business.abstracts.Administrators;

import java.util.List;

import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.entities.concrete.Administrators;

public interface AdministratorsService {
	DataResult<List<Administrators>> getAll();
	
	Result add(Administrators administrators);
}
