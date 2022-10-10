
public class CustomerManager {
	
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	
	
	public void Save() /// burda encapsulation yaptık direk mainde özellikleri ekliyecek customer a istediğim kadar özellik ekleyeyim farketmez 
	{
		
		System.out.println("Müşteri kaydedildi" );
	}
	public void Delete()
	{
		
		System.out.println("Müşteri Silindi");
	}
	
	public void GiveCredit() {	
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
	}
}
