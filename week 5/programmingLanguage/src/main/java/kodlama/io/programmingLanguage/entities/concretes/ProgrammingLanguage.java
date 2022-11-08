package kodlama.io.programmingLanguage.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "languages")
@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","technologies"})
public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "language_id")
	private int id;
	@Column(name = "language_name")
	private String name;
	
	@OneToMany (mappedBy = "programmingLanguage", cascade= CascadeType.ALL)
	@JsonIgnore
	private List<Technology> technologies;
	

	

}
