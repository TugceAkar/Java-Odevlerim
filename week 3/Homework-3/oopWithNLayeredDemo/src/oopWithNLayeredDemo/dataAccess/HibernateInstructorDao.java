package oopWithNLayeredDemo.dataAccess;

import oopWithNLayeredDemo.entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao {
	
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veri tabanına eklendi : "+
	 instructor.getInstructorFirstName()+" "+ instructor.getInstructorLastName());
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veri tabanında güncellendi : "+
				 instructor.getInstructorFirstName()+" "+ instructor.getInstructorLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veri tabanından silindi : "+
				 instructor.getInstructorFirstName()+" "+ instructor.getInstructorLastName());
		
	}

	@Override
	public Instructor[] getAll() {
		Instructor[] instructors = new Instructor[] {new Instructor(1, "Engin", "Demiroğ"), new Instructor(2,"Tuğçe","Akar")};
		return instructors;
	}

}
