import java.util.Scanner;

public class RequestFour {
	private static Scanner odczyt;

	public static void main(String[] args) {

		odczyt = new Scanner(System.in);
		System.out.println("podaj ile zarabiasz kasy:");
		double dochod = odczyt.nextDouble();
		if (dochod < 85.528) {
			System.out.println("podatek"  +  (dochod * 0.18 - 556.2));
		} else {
			System.out.println("podatek" + (14839 + (dochod - 85528) * 0.32));
		}
	}
}
