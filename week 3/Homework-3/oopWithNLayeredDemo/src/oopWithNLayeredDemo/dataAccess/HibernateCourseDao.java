package oopWithNLayeredDemo.dataAccess;


import oopWithNLayeredDemo.entities.Course;

public class HibernateCourseDao  implements ICourseDao{
	
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi"+ " " + course.getCourseName());
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile veri tabanında güncellendi : "+ course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile veri tabanından silindi : "+ course.getCourseName());
		
	}


}
