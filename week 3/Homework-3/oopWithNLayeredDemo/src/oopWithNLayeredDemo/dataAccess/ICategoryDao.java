package oopWithNLayeredDemo.dataAccess;

import oopWithNLayeredDemo.entities.Category;

public interface ICategoryDao {
	
	public void add(Category category);
	public void update (Category category);
	public void delete (Category category);
	public Category[] getAll();
}
