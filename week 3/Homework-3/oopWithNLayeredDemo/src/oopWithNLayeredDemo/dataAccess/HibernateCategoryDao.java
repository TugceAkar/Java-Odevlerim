package oopWithNLayeredDemo.dataAccess;

import oopWithNLayeredDemo.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{
	
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına eklendi : "+ category.getCategoryName());
}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile veri tabanında güncellendi : "+ category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile veri tabanından silindi : "+ category.getCategoryName());
		
	}


}
