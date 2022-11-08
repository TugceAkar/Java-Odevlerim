package kodlama.io.programmingLanguage.bussines.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.bussines.requests.languages.AddProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.requests.languages.DeleteProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.requests.languages.UpdateProgrammigLanguageRequests;
import kodlama.io.programmingLanguage.bussines.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.programmingLanguage.bussines.responses.GetByIdProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	
	void add(AddProgrammigLanguageRequests addProgrammigLanguageRequests ) throws Exception;
	void update(UpdateProgrammigLanguageRequests updateProgrammigLanguageRequests) throws Exception;
	void delete(DeleteProgrammigLanguageRequests deleteProgrammigLanguageRequests);

	GetByIdProgrammingLanguageResponse getById(int id);
	List<GetAllProgrammingLanguageResponse> getAll() throws Exception;
	
	
	

}
