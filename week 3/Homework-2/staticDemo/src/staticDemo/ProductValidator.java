package staticDemo;

public class ProductValidator {
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) { // ! işaredi değil demek ve isEmpty boş isim yazılırsa anlamında kullandık
			return true; }
		else {
			return false;
			
		
	}
	}

}
