
public class minmax {

	public static void main(String args[]) {
		int[] number =new int[5];
		int min, max;
		number[0]= 1;
		number[1]= 2;
		number[3]=3;
		number [4]=4;
		number [5]=5;
		int min1 = max =number[0];
		for(int i=1; i<10; i++){
			if( number[i]<min1)min = number[i];
			if (number[i]>max)max=  number[i];
			}
		System.out.println("najmniejsza i najwieksza wartosc: " + min1 + + max);
}
}