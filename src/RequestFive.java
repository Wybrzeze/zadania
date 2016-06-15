import java.util.Scanner;

public class RequestFive {
	private static Scanner odczytkwota;
	private static Scanner odczytrata;

	public static void main(String[] args) {
		odczytkwota = new Scanner(System.in);
		System.out.println("podaj kwote:");
		double kwota;
		kwota = odczytkwota.nextDouble();
		if (kwota < 100 || kwota > 1000) {
			System.out.println("Bank nie udziela kredtu. Kwota musi być wieksza od 100 i mniejsza od 10 000");
		}
		/*
		 * else { System.out.println(x););
		 */
		odczytrata = new Scanner(System.in);
		System.out.println("Podaj liczbe rat:");
		int rata;
		rata = odczytrata.nextInt();
		if (rata < 6 || rata > 48) {
			System.out.print("raty udzielane są od 6 do 48rat");
		}
		if (rata >= 6 && rata <= 12) {
			double odsetki = kwota + (kwota * 0.25);
			System.out.println("rata wynosi" + odsetki);
		} else if (rata >= 13 && rata <= 24) {
			double odsetki1 = kwota + (kwota * 0.05);
			System.out.println("rata wynosi" + odsetki1);
		} else if (rata >= 25 && rata <= 48) {
			double odsetki2 = kwota + (kwota * 0.10);
			System.out.println("rata wynosi" + odsetki2);
		}

	}
}
