  package kodlama.io.programmingLanguage.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.bussines.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguage.bussines.requests.languages.AddProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.requests.languages.DeleteProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.requests.languages.UpdateProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.programmingLanguage.bussines.responses.GetByIdProgrammingLanguageResponse;
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
	public List<GetAllProgrammingLanguageResponse> getAll() throws Exception{
		return languageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public GetByIdProgrammingLanguageResponse getById(int id){
		return languageService.getById(id);
	}
	

	@PostMapping("/add")
	public void add(AddProgrammigLanguageRequests addProgrammigLanguageRequests) throws Exception {
		languageService.add(addProgrammigLanguageRequests);
	}
	
	@PutMapping("/update")
	public void update(UpdateProgrammigLanguageRequests updateProgrammigLanguageRequests) throws Exception {
		languageService.update(updateProgrammigLanguageRequests);
	}

	@DeleteMapping("/delete")
	public void delete(DeleteProgrammigLanguageRequests deleteProgrammigLanguageRequests) {
		languageService.delete(deleteProgrammigLanguageRequests);
	}
}
