package methods2;

public class Main {

	public static void main(String[] args) {
	
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(5,6,7,8,9,10);
		System.out.println(toplam);
	
	}

	public static void ekle() {
		System.out.println("Eklendi");
		
	}
	
	public static void sil() {
		System.out.println("Silindi");
	
	}
	public static void güncelle () {
		System.out.println("Güncelle");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
		
}
	public static int topla2(int...sayilar ) {
		int toplam=0;
		for(int sayi: sayilar) {
		toplam+=sayi;
		
	}
		return toplam;
	}
				
	public static String sehirVer() {
		return "Ankara";
	}
}
