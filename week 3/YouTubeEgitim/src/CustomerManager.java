
public class CustomerManager {
	
	private Customer _customer;
	
	public CustomerManager(Customer customer) {
		_customer = customer;
	}
	
	
	public void Save() /// burda encapsulation yaptık direk mainde özellikleri ekliyecek customer a istediğim kadar özellik ekleyeyim farketmez 
	{
		
		System.out.println("Müşteri kaydedildi :" + _customer.City);
	}
	public void Delete()
	{
		
		System.out.println("Müşteri Silindi :" + _customer.City);
	}
}
