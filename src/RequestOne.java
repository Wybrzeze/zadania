import java.util.Scanner;

public class RequestOne {
	private static Scanner odczyt;

	public static void main(String[] args) {
		int temp;
		int temp1;
		odczyt = new Scanner(System.in);
		System.out.println("Podaj Stopnie w Celcjuszach, a ja przeliczę je na Farenhaity");
		temp = odczyt.nextInt();
		temp1 = (temp * 2) + 32;
		System.out.println("temperatura w Farnehaitach to " + temp1 + "mam blad bo nie mogę przeliczyc 1,8 a już zaczyna robić sie pozno");
	}
}
