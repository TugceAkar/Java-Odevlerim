package kodlama.io.programmingLanguage.bussines.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(ProgrammingLanguage programmingLanguage);
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	

}
