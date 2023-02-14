package javaprograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num = 370;
		int no = num ;
		int sum =0;
		while(num>0) {
			int rem = num%10 ;
			sum =sum+(rem*rem*rem);
			num=num/10;
			
		}
		if(no== sum) 
			System.out.println("The given number is Amstrong Number");
		else 
			System.out.println("The given number is not a Amstrong Number");
		
	}

}
