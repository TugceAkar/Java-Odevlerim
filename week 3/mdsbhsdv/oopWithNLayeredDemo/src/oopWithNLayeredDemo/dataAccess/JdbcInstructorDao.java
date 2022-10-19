package oopWithNLayeredDemo.dataAccess;

import oopWithNLayeredDemo.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {
	
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Jdbc ile veri tabanına eklendi : "+
	 instructor.getInstructorFirstName()+" "+ instructor.getInstructorLastName());
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Eğitmen Jdbc ile veri tabanı güncellendi : "+
				 instructor.getInstructorFirstName()+" "+ instructor.getInstructorLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Eğitmen Jdbc ile veri tabanından silindi : "+
				 instructor.getInstructorFirstName()+" "+ instructor.getInstructorLastName());
		
	}


}
