
public abstract class BaseCreditManager implements ICreditManager {

	@Override
	public abstract void Calculate();

	@Override
	public void Save() {
		System.out.println("Kaydedildi");
		
	}
	
	

}
//abstract sınıflar new lenemez