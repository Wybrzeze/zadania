
import java.util.Scanner;

public class requestXXX {
	public static void main(String[] args) {

		System.out.print("podaj liczbe");
		int liczba;
		Scanner odczyt = new Scanner(System.in);
		liczba = odczyt.nextInt();

		int liczba1 = 0;
		do {

			System.out.print("druga liczba musi byc wieksza od 1 ");

			Scanner odczyt2 = new Scanner(System.in);
			liczba1 = odczyt2.nextInt();
		} while (liczba1 < liczba);
		int suma = 0;
		int a = 0;
		int liczba3 = liczba;
		int liczba4 = liczba;


while (liczba3 <= liczba1) {
			suma = suma + liczba3;
			liczba3++;

		}
		System.out.println(suma);
		suma = 0;
		a = 0;

		do {
			suma = suma + liczba4;
			liczba4++;
		} while (liczba4 <= liczba1);
		System.out.println(suma);

		suma = 0;

		for (a = 0; liczba <= liczba1; a++) {
			suma = suma + liczba;
			liczba++;
		}

		System.out.print(suma);

	}
}