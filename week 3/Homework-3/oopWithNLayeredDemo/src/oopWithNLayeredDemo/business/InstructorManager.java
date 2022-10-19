package oopWithNLayeredDemo.business;

import oopWithNLayeredDemo.core.loging.ILogger;
import oopWithNLayeredDemo.dataAccess.IInstructorDao;
import oopWithNLayeredDemo.entities.Instructor;

public class InstructorManager {

	private IInstructorDao instructorDao;
	private ILogger[] loggers;

	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {

		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {

		this.instructorDao.add(instructor);

		for (ILogger logger : loggers) {
			logger.log(instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName());
		}
	}

	public void update(Instructor instructor) {
			
			this.instructorDao.update(instructor);
			
			for(ILogger logger : loggers) {
				logger.log(instructor.getInstructorFirstName() +" "+ instructor.getInstructorLastName());
			}
	}
	public void delete(Instructor instructor) {

		this.instructorDao.delete(instructor);

		for (ILogger logger : loggers) {
			logger.log(instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName());
		}
	}

}
