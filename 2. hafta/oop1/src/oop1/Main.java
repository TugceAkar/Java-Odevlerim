package oop1;

public class Main {

	public static void main(String[] args) {
//		String mesaj = "Vade oranı";
//
//		Product product1 = new Product();
//		product1.setName("Delonghi Kahve Makinesi");
//		product1.setDiscount(7);
//		product1.setImageUrl("İmage1.jpg");
//		product1.setUnitPrice(7500);
//		product1.setUnitsInstock(3);
//		
//		Product product2 = new Product();
//		product2.setName("Smeg Kahve Makinesi");
//		product2.setDiscount(7);
//		product2.setImageUrl("İmage2.jpg");
//		product2.setUnitPrice(7500);
//		product2.setUnitsInstock(3);
//
//
//		Product product3 = new Product();
//		product3.setName("Kitchen Aid Kahve Makinesi");
//		product3.setDiscount(7);
//		product3.setImageUrl("İmage3.jpg");
//		product3.setUnitPrice(7500);
//		product3.setUnitsInstock(3);
//
//
//		Product[] products = {product1, product2, product3};
//	    for (Product product : products) {
//		System.out.println(product.getName());
//		
		
		İndividualCustomer individualCustomer = new İndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0000000000");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Tuğçe");
		individualCustomer.setLastName("Akar");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("11111111");
		corporateCustomer.setCustomerNumber("3333333");
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setTaxNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
			for (Customer customer : customers) {
				System.out.println(customer);
			}
	}
		}


