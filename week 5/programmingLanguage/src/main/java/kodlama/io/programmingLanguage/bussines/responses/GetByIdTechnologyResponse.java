package kodlama.io.programmingLanguage.bussines.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdTechnologyResponse {

	String name;
	int id;
	String languageName;
}
