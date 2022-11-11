package kodlama.io.programmingLanguage.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguage.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer>{


	

	
}
	