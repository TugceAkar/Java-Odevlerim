package kodlama.io.programmingLanguage.bussines.requests.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddTechnologyRequests {

	private String name;
	private int programmingLanguageId;
}
