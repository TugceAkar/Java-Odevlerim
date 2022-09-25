
public class asalSayilar {

	public static void main(String[] args) {
		int number = 1;
		//	int remainder = number % 2;
		//	System.out.println(remainder);
			boolean isPrime = true;
			if(number==1) {
				System.out.println("Asal sayı değildir");
				return;}
			for(int i= 2; i<number; i++) {
			if (number % i == 0 ) {
				isPrime = false;
			}}	
			if(number<1) {
				System.out.println("Geçersiz sayı girdiniz");

//				if (number<1) {
//					System.out.println("Geçersiz sayı girdiniz");
				}
//			}
				
			if(isPrime) {
				System.out.println("asal sayıdır");
				
					
				}else {
					System.out.println("asal sayı değildir");	
					}
		} 
		}

	}

}
