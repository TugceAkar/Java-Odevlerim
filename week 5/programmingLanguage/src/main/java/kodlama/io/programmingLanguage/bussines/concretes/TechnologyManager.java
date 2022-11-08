package kodlama.io.programmingLanguage.bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguage.bussines.abstracts.TechnologyService;
import kodlama.io.programmingLanguage.bussines.requests.technologies.AddTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.requests.technologies.DeleteTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.requests.technologies.UpdateTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.responses.GetAllTechnologyResponse;
import kodlama.io.programmingLanguage.bussines.responses.GetByIdTechnologyResponse;
import kodlama.io.programmingLanguage.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;
import kodlama.io.programmingLanguage.entities.concretes.Technology;
@Service
public class TechnologyManager implements TechnologyService{

	private TechnologyRepository technologyRepository;
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository) {
		this.technologyRepository = technologyRepository;
	}
	
	@Override
	public List<GetAllTechnologyResponse> getAll() throws Exception {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> technologyResponse = new ArrayList<GetAllTechnologyResponse>();
		for (Technology technology : technologies) {
			GetAllTechnologyResponse technologyResponseItem = new GetAllTechnologyResponse();
			technologyResponseItem.setId(technology.getId());
			technologyResponseItem.setName(technology.getName());
			technologyResponseItem.setProgrammingLanguage(technology.getProgrammingLanguage());
			technologyResponse.add(technologyResponseItem);
		}
		
		return technologyResponse;
	}
	
	@Override
	public void add(AddTechnologyRequests addTechnologyRequests) throws Exception {
		
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		
		programmingLanguage.setId(addTechnologyRequests.getProgrammingLanguageId());
		technology.setName(addTechnologyRequests.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		
		for(Technology technologies : this.technologyRepository.findAll()) {
			if(technologies.getName().equals(programmingLanguage.getName())){
				throw new Exception("Bu alt teknoloji mevcuttur. Farklı bir teknoloji adı giriniz");
			}
			if(technologies.getName().isBlank()) {
				throw new Exception("Bu alan boş bırakılamaz");
			}
		}
			
		technologyRepository.save(technology);
	}

	

	@Override
	public void update(UpdateTechnologyRequests updateTechnologyRequests) throws Exception {
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		
		programmingLanguage.setId(updateTechnologyRequests.getProgrammingLanguageId());
		
		technology.setId(updateTechnologyRequests.getId());
		technology.setName(updateTechnologyRequests.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		for(Technology technologies : this.technologyRepository.findAll()) {
			if(technologies.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu alt teknoloji mevcuttur. Farklı bir teknoloji adı giriniz");
			}
			if(technologies.getName().isBlank()) {
				throw new Exception("Bu alan boş bırakılamaz");
			}
		}
		technologyRepository.save(technology);
		
		
	}

	@Override
	public void delete(DeleteTechnologyRequests deleteTechnologyRequests) {
		Technology technology = new Technology();
		technology.setId(deleteTechnologyRequests.getId());
		technologyRepository.delete(technology);
		
	}

	@Override
	public GetByIdTechnologyResponse getById(int id) {
		Technology technology = technologyRepository.findById(id).get();
		GetByIdTechnologyResponse technologyResponseItem = new GetByIdTechnologyResponse();
		technologyResponseItem.setId(technology.getId());
		technologyResponseItem.setName(technology.getName());
		technologyResponseItem.setLanguageName(technology.getProgrammingLanguage().getName());

		return technologyResponseItem;

	}

}
