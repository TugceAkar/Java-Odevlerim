
public class rcapDizi {

	public static void main(String[] args) {
		double[] myList = {1.2, 2.3, 5.6, 7.2};
		double total=0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number;}
			total = total+ number;
			System.out.println(number);
		}
  System.out.println(("Toplam = "+ total));
  System.out.println(("EnBüyük = "+ max));
  
  			System.out.println("--------------------------");
  			
  
  
	}

}

	}

}
