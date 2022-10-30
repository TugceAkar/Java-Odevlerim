  package kodlama.io.programmingLanguage.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.bussines.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguage.bussines.concretes.ProgrammingLanguageManager;
import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;
@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
	
	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id){
		return languageService.getById(id);
	}
	


	


}
