
public class Main {

	public static void main(String[] args) {
//		AskerKrediManager askerKrediManager = new AskerKrediManager();
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		TarimKrediManager tarimKrediManager = new TarimKrediManager();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		
		

	}

}
