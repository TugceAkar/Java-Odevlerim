package kodlama.io.programmingLanguage.bussines.responses;

import kodlama.io.programmingLanguage.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllTechnologyResponse {

	String name;
	int id;
	ProgrammingLanguage programmingLanguage;
}
