package intro;

public class diziler {

	public static void main(String[] args) {
		
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
						System.out.println("-----------------------");
		//alttaki kodla tekrar tekrar print yapmaya gerek yok sadece yeni öğrenci eklemek yeterli
		String[] ogrenciler = new String[4];
			ogrenciler[0] = "Engin";
			ogrenciler[1] = "Derin";
			ogrenciler[2] = "Salih";
			ogrenciler[3] = "ali";
	
		for(int i=0; i<ogrenciler.length; i++) { // ogrenciler.length demek öğrenciler eleman sayısından küçük olacak
			System.out.println(ogrenciler[i]);
						System.out.println("-----------------------");
						
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
	}
	}
}
