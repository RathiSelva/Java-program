package javaprograms;

public class PrimeNumber {

	 public static void main(String[] args) {
		int num = 17;
		int count = 0;
		
		// for(int j =1; j<=num; j++)
			for(int i=1;i<= num; i++) {
				if(num%i==0) 
					count++;
					
				}
				if(count==2) {
			System.out.println(num + " is a PrimeNumber");
			} else
				
			System.out.println(num + " is not a PrimeNumber");
		}
	 
	
}