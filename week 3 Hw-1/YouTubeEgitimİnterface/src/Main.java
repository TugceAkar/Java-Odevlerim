
public class Main {

	public static void main(String[] args) {
		// interfaceler iş yapan classların sadce imza seviyesinde yazarak yazılımları
		// korumak adına yapılan çalışma.

		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.GiveCredit();
		System.out.println();
		
	}

}
