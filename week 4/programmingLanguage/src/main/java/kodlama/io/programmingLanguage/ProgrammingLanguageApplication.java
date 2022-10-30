package kodlama.io.programmingLanguage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlama.io.programmingLanguage.bussines.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguage.bussines.concretes.ProgrammingLanguageManager;
import kodlama.io.programmingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguage.dataAccess.concretes.InMemoryProgrammingLanguageRepository;

@SpringBootApplication
public class ProgrammingLanguageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgrammingLanguageApplication.class, args);
		
		ProgrammingLanguageService plmanager = new ProgrammingLanguageManager
				(new InMemoryProgrammingLanguageRepository());
		
		plmanager.getById(3);
		
	}

}
