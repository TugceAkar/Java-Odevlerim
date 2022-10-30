package kodlama.io.programmingLanguage.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;

	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "C#"));
		languages.add(new ProgrammingLanguage(2, "Phyton"));
		languages.add(new ProgrammingLanguage(3, "java"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languages.add(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) { // id=2 , name=piton
		for (ProgrammingLanguage language : languages) {
			if (language.getId() == programmingLanguage.getId()) {
				language.setName(programmingLanguage.getName());

			}
		}
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		languages.remove(programmingLanguage);

	}
	

	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		return null;
	}

}
