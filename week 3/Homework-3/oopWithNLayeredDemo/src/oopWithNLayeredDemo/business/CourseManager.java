package oopWithNLayeredDemo.business;

import oopWithNLayeredDemo.core.loging.ILogger;
import oopWithNLayeredDemo.dataAccess.ICourseDao;
import oopWithNLayeredDemo.entities.Course;

public class CourseManager {

	private ICourseDao courseDao;
	private ILogger[] loggers;

	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if(course.getCoursePrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		
	//HibernateCourseDao courseDao = new HibernateCourseDao();
	this.courseDao.add(course);
	
	for(ILogger logger : loggers) {
		logger.log(course.getCourseName());
	}
	}
	public void update(Course course) throws Exception {
		if(course.getCoursePrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		this.courseDao.update(course);
		for(ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	public void delete(Course course) {
		this.courseDao.delete(course);
		for(ILogger logger : loggers) {
			logger.log(course.getCourseName());
	}
	}}
