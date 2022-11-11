package kodlama.io.programmingLanguage.bussines.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.bussines.requests.technologies.AddTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.requests.technologies.DeleteTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.requests.technologies.UpdateTechnologyRequests;
import kodlama.io.programmingLanguage.bussines.responses.GetAllTechnologyResponse;
import kodlama.io.programmingLanguage.bussines.responses.GetByIdTechnologyResponse;

public interface TechnologyService {

	
	
	void add(AddTechnologyRequests addTechnologyRequests) throws Exception;
	void update(UpdateTechnologyRequests updateTechnologyRequests) throws Exception;
	void delete(DeleteTechnologyRequests deleteTechnologyRequests) throws Exception;
	List<GetAllTechnologyResponse> getAll() throws Exception;
	GetByIdTechnologyResponse getById(int id);
	void deleteAll(DeleteTechnologyRequests deleteTechnologyRequests);

}
