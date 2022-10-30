package kodlama.io.programmingLanguage.bussines.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguage.bussines.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	private ProgrammingLanguageRepository languageRepository;
	

	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		return languageRepository.getAll();
	}


	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		for(ProgrammingLanguage languages : this.languageRepository.getAll()) {
			if(languages.getName() == programmingLanguage.getName()) {
				throw new Exception("Bu dil mevcuttur. Farklı bir dil giriniz");
			}
			
			if(languages.getName() == null) {
				throw new Exception("Bu alan boş bırakılamaz. Lütfen bir dil girin.");
			}
			languageRepository.add(programmingLanguage);
		}
		
	}


	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		for(ProgrammingLanguage languages : this.languageRepository.getAll()) {
			if(languages.getName() == programmingLanguage.getName()) {
				throw new Exception("Bu dil mevcuttur. Farklı bir dil giriniz");
			}
			if(languages.getName() == null) {
				throw new Exception("Bu alan boş bırakılamaz. Lütfen bir dil girin.");
			}
		}			
		languageRepository.update(programmingLanguage);
	} 


	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		languageRepository.delete(programmingLanguage);
			}


	@Override
	public ProgrammingLanguage getById(int id) {
		return languageRepository.getById(id);
	}

}
