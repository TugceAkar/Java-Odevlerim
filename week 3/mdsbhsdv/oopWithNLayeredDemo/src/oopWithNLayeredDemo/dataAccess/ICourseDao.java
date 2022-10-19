package oopWithNLayeredDemo.dataAccess;

import oopWithNLayeredDemo.entities.Course;

public interface ICourseDao {
	
public void add(Course course);
public void update(Course course);
public void delete(Course course);

}
