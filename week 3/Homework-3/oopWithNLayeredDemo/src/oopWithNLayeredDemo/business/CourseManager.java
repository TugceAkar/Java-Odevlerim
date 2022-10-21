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

		for (Course course1 : courseDao.getAll()) {
			if (course1.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Bu kurs zaten sistemde kayıtlıdır.");
			}
		}
		
		for (Course course1 : courseDao.getAll()) {
			
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		}
		// HibernateCourseDao courseDao = new HibernateCourseDao();
		this.courseDao.add(course);

		for (ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

	public void update(Course course) throws Exception {
		for (Course course1 : courseDao.getAll()) {
			if (course1.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Bu kurs zaten sistemde kayıtlıdır.");
			}
		}
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		this.courseDao.update(course);
		for (ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

	public void delete(Course course) {
		this.courseDao.delete(course);
		Course[] courses = this.courseDao.getAll();
		
		for (ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
