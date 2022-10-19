package oopWithNLayeredDemo.dataAccess;

import oopWithNLayeredDemo.entities.Course;

public class JdbcCourseDao implements ICourseDao{
	
	public void add(Course course) {
		System.out.println("Jdbc ile veri tabanına eklendi : " + course.getCourseName());
	}

	@Override
	public void update(Course course) {
		System.out.println("Jdbc ile veri tabanı güncellendi : " + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Jdbc ile veri tabanından silindi : " + course.getCourseName());
		
	}

}
