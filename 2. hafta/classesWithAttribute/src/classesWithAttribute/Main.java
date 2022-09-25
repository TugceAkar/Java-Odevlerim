package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
	
	Product product = new Product(1, "bilgisayar", "açıklama", 3, "beyaz", "kod", 10);
	
		
//		ProductManager productManager = new ProductManager();
//		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
