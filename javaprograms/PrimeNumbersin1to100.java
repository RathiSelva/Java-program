package javaprograms;

public class PrimeNumbersin1to100 {

	public static boolean isPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void getPrimeNumbers(int num) {

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) 

				System.out.print(" " + i);
			}
		}
		
public static void main(String[]args) {
	
			PrimeNumbersin1to100 pn =new PrimeNumbersin1to100();
		//	pn.isPrimeNumber(3);
			pn.getPrimeNumbers(100);
			
			
		
	}
}
