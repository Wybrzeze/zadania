/*apisać program, który:
•
utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z
przedziału [
−
10
, . . . ,
10],
•
wypisze na ekranie zawartość tablicy,
•
wyznaczy najmniejszy oraz najwięszy element w tablicy,
•
wyznaczy średnią arytmetyczną elementów tablicy,
•
wyznaczy ile elementów jest mniejszych, ile większych od średniej.
•
wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatnie-
go do pierwszego.
*/
public class requestTable {

	public static void main(String args[]) {
		int sample[]= new int[20];
		int i;
		
			for (i =-10; i < 10; i= i+1)   // nie działa znak wiekszosci
				sample[i]= i;
			for (i= -10; i <10; i= i+1);
			System.out.println("elemet sample [" + i +"]): "+ sample[i]);
					
	
	}
	}

