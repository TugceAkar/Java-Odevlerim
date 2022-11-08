package kodlama.io.programmingLanguage.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "teknologies")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Technology {
	@Id
	@Column(name = "technology_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "technology_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private ProgrammingLanguage programmingLanguage;


	}

	
	
	


