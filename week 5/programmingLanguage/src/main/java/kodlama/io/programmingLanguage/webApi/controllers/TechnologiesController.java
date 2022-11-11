package kodlama.io.programmingLanguage.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.bussines.abstracts.TechnologyService;
import kodlama.io.programmingLanguage.bussines.requests.technologies.AddTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.requests.technologies.DeleteTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.requests.technologies.UpdateTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.responses.GetAllTechnologyResponse;
import kodlama.io.programmingLanguage.bussines.responses.GetByIdTechnologyResponse;
@RestController
@RequestMapping("/api/tecnologies")

public class TechnologiesController {

	private TechnologyService technologyService;
	
	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService=technologyService ;
	}
	@GetMapping("/getall")
	List<GetAllTechnologyResponse> getAll() throws Exception{
		return technologyService.getAll();
	}
	
	@GetMapping("/getById")
	public GetByIdTechnologyResponse getById(int id) {
		return technologyService.getById(id);
	}
	@PostMapping("/add")
	public void add(AddTechnologyRequests addTechnologyRequests) throws Exception {
		technologyService.add(addTechnologyRequests);
	}
	@PutMapping("/update")
	public void update(UpdateTechnologyRequests updateTechnologyRequests) throws Exception {
		technologyService.update(updateTechnologyRequests);
	}
	@DeleteMapping("/delete")
	public void delete(DeleteTechnologyRequests deleteTechnologyRequests) throws Exception {
		technologyService.delete(deleteTechnologyRequests);
	}
	@RequestMapping("deleteAll")
	public void deleteAll(DeleteTechnologyRequests deleteTechnologyRequests) {
		technologyService.deleteAll(deleteTechnologyRequests);
	}
}
