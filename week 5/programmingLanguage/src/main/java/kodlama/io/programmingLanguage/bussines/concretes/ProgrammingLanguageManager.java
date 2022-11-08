package kodlama.io.programmingLanguage.bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguage.bussines.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguage.bussines.requests.languages.AddProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.requests.languages.DeleteProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.requests.languages.UpdateProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.programmingLanguage.bussines.responses.GetByIdProgrammingLanguageResponse;
import kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages = languageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> languageResponse = new ArrayList<GetAllProgrammingLanguageResponse>();

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguageResponse languageResponseItem = new GetAllProgrammingLanguageResponse();
			languageResponseItem.setId(programmingLanguage.getId());
			languageResponseItem.setName(programmingLanguage.getName());
			languageResponse.add(languageResponseItem);

		}
		return languageResponse;
	}

	@Override
	public void add(AddProgrammigLanguageRequests addProgrammigLanguageRequests) throws Exception {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(addProgrammigLanguageRequests.getName());
		
		for (ProgrammingLanguage languages : this.languageRepository.findAll()) {
			if (languages.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu dil mevcuttur. Farklı bir dil giriniz");
			}

			if (languages.getName().isBlank()) {
				throw new Exception("Bu alan boş bırakılamaz. Lütfen bir dil girin.");
			}

		}
		languageRepository.save(programmingLanguage);

	}

	@Override
	public void update(UpdateProgrammigLanguageRequests updateProgrammigLanguageRequests) throws Exception {
		
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(updateProgrammigLanguageRequests.getName());
		programmingLanguage.setId(updateProgrammigLanguageRequests.getId());
		
		for (ProgrammingLanguage languages : this.languageRepository.findAll()) {
			if (languages.getName().equals(programmingLanguage.getName())) {	
				throw new Exception("Bu dil mevcuttur. Farklı bir dil giriniz");
			}

			if (languages.getName().isBlank()) {
				throw new Exception("Bu alan boş bırakılamaz. Lütfen bir dil girin.");
			}
			if (programmingLanguage.getId()!= languages.getId()) {
				throw new Exception("Varolmayan bir dili güncelleyemezsin.");
			}

		}
		languageRepository.save(programmingLanguage);
	}

	@Override
	public void delete(DeleteProgrammigLanguageRequests deleteProgrammigLanguageRequests) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setId(deleteProgrammigLanguageRequests.getId());
		languageRepository.delete(programmingLanguage);

	}

	@Override
	public GetByIdProgrammingLanguageResponse getById(int id) {
		ProgrammingLanguage programmingLanguage = languageRepository.findById(id).get();
		GetByIdProgrammingLanguageResponse languageResponseItem = new GetByIdProgrammingLanguageResponse();
		languageResponseItem.setId(programmingLanguage.getId());
		languageResponseItem.setName(programmingLanguage.getName());

		return languageResponseItem;
	}

}
