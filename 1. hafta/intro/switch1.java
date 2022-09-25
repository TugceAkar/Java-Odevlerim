package intro;

public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		
		switch(grade) {//case durum demek buraya notu giriyoruz
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;  //burada programı bitir demek break
			case 'B': //yeni durum giriyoruz
				System.out.println("Çok Güzel : Geçtiniz"); 
				break;
			case 'C': 
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':	
				System.out.println("Fena Değil : Geçtiniz");
				break;
			case 'F':	
				System.out.println("Maalesef : Kaldınız");
				break; 
				
				default:
					System.out.println("Geçersiz not girdiniz"); } 
	}

}
