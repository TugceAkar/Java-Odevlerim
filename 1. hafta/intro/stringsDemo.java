
public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "       Bugün hava çok güzel.        ";
		System.out.println(mesaj);
//
//		System.err.println("Eleman sayısı :" + mesaj.length());
//		System.err.println("5. eleman = " + mesaj.charAt(4));
//		System.err.println(mesaj.concat (":) Yaşasın"));
//		System.err.println(mesaj.startsWith("A"));  // a ile başlıyor mu diyer soruyor false dönüyor.
//		System.out.println(mesaj.endsWith(".")); 	 // . ile bitiyor mu diyer soruyor true dönüyor.
//		
//		
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		
//		System.out.println(mesaj.indexOf('a')); //ilk kaçıncı sayı a
//		System.out.println(mesaj.lastIndexOf("a")); //sondan kaçıncı sayı a
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); //2. karakterden sonrasını yazar
		System.out.println(mesaj.substring(2,4)); //2. kaarakterden başla 4 e kadar
		for(String kelime : mesaj.split(" ")) { //tek tek kelimeleri alt alta yazar
			System.out.println(kelime);
			
		System.out.println(mesaj.toLowerCase()); //tüm kelimeleri küçük harf yapar
		System.out.println(mesaj.toUpperCase()); //tüm kelimeleri büyük harf yapar
		System.out.println(mesaj.trim()); //cümlenin başındaki ve sonundaki boşlukları yok sayar.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
	}

}

	}

}
