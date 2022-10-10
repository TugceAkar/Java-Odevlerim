package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();
		sayiBulma();
		sayiBulma();
	}
		
		
		
		
		
	//camel casing yazılır fonksiyon isimleri class isimleri pascal	
	public static void	sayiBulma() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 1;
		Boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
	String mesaj="";	
	if (varMi) {
		mesaj="Sayı mevcuttur."+aranacak;
		mesajVer(mesaj);
	}else {
		mesajVer("Sayı mevcut değildir."+aranacak);
				}}
	
		

	public static void mesajVer (String mesaj) {
		System.out.println(mesaj);
	}

}