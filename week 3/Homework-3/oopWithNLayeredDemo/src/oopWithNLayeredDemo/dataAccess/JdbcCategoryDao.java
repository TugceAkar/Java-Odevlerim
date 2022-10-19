package oopWithNLayeredDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredDemo.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{
	public void add(Category category) {
		System.out.println("Jdbc ile veri tabanına eklendi : "+ category.getCategoryName());
}

	@Override
	public void update(Category category) {
		System.out.println("Jdbc ile veri tabanında güncellendi : "+ category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Jdbc ile veri tabanından silindi : "+ category.getCategoryName());
		
	}

}
