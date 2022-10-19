package oopWithNLayeredDemo.business;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredDemo.core.loging.ILogger;
import oopWithNLayeredDemo.dataAccess.ICategoryDao;
import oopWithNLayeredDemo.entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private ILogger[] loggers;

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	List<Category> categories = new ArrayList<Category>();

	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
			if (category1.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Bu kategori zaten sistemde kayıtlıdır.");
			}
		}

		this.categoryDao.add(category);

		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

	public void update(Category category) throws Exception {
		for (Category category1 : categories) {
			if (category1.getCategoryName().equals(category.getCategoryName()))  {
				throw new Exception("Bu kategori zaten sistemde kayıtlıdır.");
			}
		}

		this.categoryDao.update(category);

		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

	public void delete(Category category) {

		this.categoryDao.delete(category);

		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
