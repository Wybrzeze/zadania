import java.util.Scanner;

public class RequestTwo {
	private static Scanner odczyt1;
	private static Scanner odczyt2;
	private static Scanner odczyt3;

	public static void main(String[] args) {
		int a;
		int b;
		int c;

		odczyt1 = new Scanner(System.in);
		odczyt2 = new Scanner(System.in);
		odczyt3 = new Scanner(System.in);
		System.out.println("Podaj trzy rózne liczby całkowitę większe od 0");
		a= odczyt1.nextInt();
		b= odczyt2.nextInt();
		c= odczyt3.nextInt();
		
		if (a>b && a>c && b<c)
		{
		System.out.println("najwieksza liczba  " +a +" a najmniejsza " +b);
		}
		else if (a>b && a>c && c<b)
		{
		System.out.println("najwieksza liczba " +a +" a najmneijsza " +c);

		}
		else if (b>a && b>c && a>c)
		{
		System.out.println("najwieksza liczba  " +b +" a najmniejsza " +a);

		}
		else if (b>c && b>a && a<c)
		{
		System.out.println("najwieksza liczba  " +b +" a najmniejzsa " +a);

		}
		else if (b>a && b>c && c<a)
		{
		System.out.println("najwieksza liczba  " +b +" a najmniejsza " +c);
	}
}
}
