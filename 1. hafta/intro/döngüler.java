package intro;

public class döngüler {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i = i + 2) {
			System.out.println(i);

		}
		System.out.println("For Döngüsü Bitti.");

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("While dönüsü bitti.");

		int j = 1;
		do {
			System.out.println(j);
			j = j + 2;
		} while (j < 10);
		System.out.println("Do - While dönüsü bitti.");
	}

}
