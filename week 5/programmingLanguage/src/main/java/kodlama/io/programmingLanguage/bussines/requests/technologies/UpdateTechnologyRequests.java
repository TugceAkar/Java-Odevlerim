package kodlama.io.programmingLanguage.bussines.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTechnologyRequests {
	int id;
	String name;
	int programmingLanguageId;
	
}
