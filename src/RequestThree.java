import java.util.Scanner;

public class RequestThree {

	private static Scanner waga;
	private static Scanner wzrost;

	public static void main(String[] args) {
		double podajwage;
		double podajwzrost;
		waga = new Scanner(System.in);
		System.out.println("Podaj Łukasz swoją wagę:");
		podajwage = waga.nextDouble();
		wzrost = new Scanner(System.in);
		System.out.println("Podaj swój wzrost");
		podajwzrost = wzrost.nextDouble();	 
		double bmi= podajwage/ Math.pow(podajwzrost, 2);
		if (bmi < 18.5) {
            System.out.println("jedz wiecej");
        } else {
            if (bmi < 24.9) {
                System.out.println("Waga Prawidłowa ");
            }
            else{
                System.out.println("grubas");
            }
        }
    }
}
