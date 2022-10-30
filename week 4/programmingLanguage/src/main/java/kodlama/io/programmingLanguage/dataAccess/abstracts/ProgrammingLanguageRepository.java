package kodlama.io.programmingLanguage.dataAccess.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage programmingLanguage);
	void update(ProgrammingLanguage programmingLanguage);
	void delete(ProgrammingLanguage programmingLanguage);
	ProgrammingLanguage getById(int id);

	
}
