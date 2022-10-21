package oopWithNLayeredDemo;
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

		
		//Category
		
		Category category1 = new Category(10,"Veri Tabanı Yönetimi");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.update(category1);
		
		System.out.println("-----------------------------------");
//		Category category2 = new Category(11,"Programlama"); //Varolan bir kategori:Programlama
//
//		CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(),loggers);
//		categoryManager2.update(category2);
		
		//Course
		
		Course course2 = new Course(40, "JavaScript", 1500);
		CourseManager courseManager2 = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager2.add(course2);
		System.out.println("-----------------------------------");
		
//		Course course = new Course(5, "Algoritmalar", -1000);
//		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
//		courseManager.add(course);
//		System.out.println("-----------------------------------");
		
		
		//Instructor
		
		InstructorManager instructorManager = new InstructorManager( new HibernateInstructorDao(), loggers);
		Instructor instructor = new Instructor(2,"Tuğçe", "Akar");
		instructorManager.delete(instructor);
		System.out.println("-----------------------------------");
	
	
	}	
}

