
public class Main {

	public static void main(String[] args) {
//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;
//		sayi2 = 100;
//		
//		System.out.println(sayi1);
//		
//	////////////////////////////////////////////
//		
//		
//		int[] sayilar1 = new[] {1, 2, 3};
//		int[] sayilar2 = new[] {10, 20, 30};
//		sayilar1 = sayilar2;
//		
//		sayilar2[0] = 1000;
//		
//		System.out.println(sayilar1[0]);
//				
//cevap = 1000
//
//
//	 ///////////////////////////////////////

		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		System.out.println();
		
		
		Customer customer = new Customer();
		customer.Id=1;
		
		
		customer.City = "Antep";
		
		System.out.println();
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		System.out.println();
		
		
		Company company = new Company();
		company.TaxNumber = "1234";
		company.CompanyName = "Akar";
		
		
		Person person = new Person();
		person.NationalIdentity = "3456";
		person.FirstName="Tuğçe";
		person.LastName="Akar";
	}

	
}
