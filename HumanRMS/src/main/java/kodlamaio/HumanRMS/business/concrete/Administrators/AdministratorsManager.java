package kodlamaio.HumanRMS.business.concrete.Administrators;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanRMS.business.abstracts.Administrators.AdministratorsService;
import kodlamaio.HumanRMS.core.utilities.results.DataResult;
import kodlamaio.HumanRMS.core.utilities.results.Result;
import kodlamaio.HumanRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HumanRMS.core.utilities.results.SuccessResult;
import kodlamaio.HumanRMS.dataAccess.abstracts.AdministratorsDao;
import kodlamaio.HumanRMS.entities.concrete.Administrators;

@Service
public class AdministratorsManager implements AdministratorsService{
	
	private AdministratorsDao administratorsDao;
	
	
	@Autowired
	public AdministratorsManager(AdministratorsDao administratorsDao) {
		super();
		this.administratorsDao = administratorsDao;
	}



	@Override
	public DataResult<List<Administrators>> getAll() {
		return new SuccessDataResult<List<Administrators>>
		(this.administratorsDao.findAll() , "Data listelendi");
	}


	@Override
	public Result add(Administrators administrators) {
		this.administratorsDao.save(administrators);
		return new SuccessResult("Ürün eklendi");
	}
	
}
