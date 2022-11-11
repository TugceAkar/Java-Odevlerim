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
		emptyCheck(addTechnologyRequests.getName());
		existingCheck(addTechnologyRequests.getName());
		
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		
		programmingLanguage.setId(addTechnologyRequests.getProgrammingLanguageId());
		technology.setName(addTechnologyRequests.getName());
		technology.setProgrammingLanguage(programmingLanguage);

		technologyRepository.save(technology);
	}

	

	@Override
	public void update(UpdateTechnologyRequests updateTechnologyRequests) throws Exception {
		identityCheck(updateTechnologyRequests.getId(), "Update");
		existingCheck(updateTechnologyRequests.getName());
		emptyCheck(updateTechnologyRequests.getName());
		
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		
		programmingLanguage.setId(updateTechnologyRequests.getProgrammingLanguageId());	
		technology.setId(updateTechnologyRequests.getId());
		technology.setName(updateTechnologyRequests.getName());
		technology.setProgrammingLanguage(programmingLanguage);

		technologyRepository.save(technology);
		
		
	}



	@Override
	public void delete(DeleteTechnologyRequests deleteTechnologyRequests) throws Exception {
		identityCheck(deleteTechnologyRequests.getId(), "delete");

		Technology technology = new Technology();
		technology.setId(deleteTechnologyRequests.getId());
		technologyRepository.delete(technology);
		
	}
	
//	public void deleteAll(DeleteTechnologyRequests deleteTechnologyRequests) {
//		technologyRepository.deleteAll();
//	}  tüm verileri silmek için

	@Override
	public GetByIdTechnologyResponse getById(int id) {
		Technology technology = technologyRepository.findById(id).get();
		GetByIdTechnologyResponse technologyResponseItem = new GetByIdTechnologyResponse();
		technologyResponseItem.setId(technology.getId());
		technologyResponseItem.setName(technology.getName());
		technologyResponseItem.setLanguageName(technology.getProgrammingLanguage().getName());

		return technologyResponseItem;

	}

	private void  identityCheck(int id, String op) throws Exception {
		List<Technology> technology = this.technologyRepository.findAll();
		boolean await = true;
		for(Technology technologies : technology) {
			if(technologies.getId()==id) {
				await = false;
				break;
			}
		}
		if(await) {
			if(op == "Update") {
				throw new Exception("Varolmayan dili güncelleyemezsin");
			}
			else {
				throw new Exception("Varolmayan dili silemezsin");
			}
		}
	}
		

	private void existingCheck(String name) throws Exception {
		List<Technology> technology = this.technologyRepository.findAll();
		boolean await = false;
		for(Technology technologies : technology) {
			if(technologies.getName().equals(name)) {
				await = true;
				break;
			}
		}
		if(await) {
			throw new Exception("Bu teknoloji mevcuttur. Farklı bir teknoloji adı giriniz");
	}
	}
	
	private void emptyCheck(String name) throws Exception {
		if(name.isBlank() || name.isEmpty())
			 {
			throw new Exception("Bu alan boş bırakılamaz");
			}

	}

	@Override
	public void deleteAll(DeleteTechnologyRequests deleteTechnologyRequests) {
		// TODO Auto-generated method stub
		
	}
}
