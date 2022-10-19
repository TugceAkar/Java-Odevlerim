package oopWithNLayeredDemo;

import java.util.ArrayList;
import java.util.List;
import oopWithNLayeredDemo.business.CategoryManager;
import oopWithNLayeredDemo.business.CourseManager;
import oopWithNLayeredDemo.business.InstructorManager;
import oopWithNLayeredDemo.core.loging.DatabaseLogger;
import oopWithNLayeredDemo.core.loging.FileLogger;
import oopWithNLayeredDemo.core.loging.ILogger;
import oopWithNLayeredDemo.core.loging.MailLogger;
import oopWithNLayeredDemo.dataAccess.HibernateCourseDao;
import oopWithNLayeredDemo.dataAccess.HibernateInstructorDao;
import oopWithNLayeredDemo.dataAccess.JdbcCategoryDao;
import oopWithNLayeredDemo.entities.Category;
import oopWithNLayeredDemo.entities.Course;
import oopWithNLayeredDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

		
		//COURSES
		
		Course course1 = new Course(1, "C# Kursu", 900);
		Course course2 = new Course(2, "JavaScript Kursu", 500);
		Course course3 = new Course(3, "Phyton Kursu", 200);
		//Course course4 = new Course(4, "Java Kursu", -200);  değer 0'ın altında olduğundan hata verir
		//Course course5 = new Course(5, "JavaScript Kursu", -200); isim aynı olduğundan hata verir
		
		List<Course> courses = new ArrayList<Course>();
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		
		courseManager.add(course1);
		//courseManager.add(course2);
		courseManager.add(course3);
//		courseManager.add(course4);  hatalı kodlar
//		courseManager.add(course5);
		courseManager.delete(course2);
		
		// CATEGORIES
		
		Category category1 = new Category(1, "Online");	
		Category category2 = new Category(2, "Ders Notları");
		Category category3 = new Category(3, "Sınavlar");	
		Category category4 = new Category(4, "Online");	
		// Category category5 = new Category(1, "Online");	hatalı kod aynı isimle yazılmış
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		//categoryManager.add(category3);
		//categoryManager.add(category4);
		//categoryManager.add(category5); hatalı kod
		  categoryManager.delete(category3);
		  categoryManager.update(category4);
		
		// INSTRUCTORS
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		Instructor instructor2 = new Instructor(1, "Tuğçe", "Akar");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
		//instructorManager.add(instructor2);
		instructorManager.update(instructor2);
	}	
	
}
