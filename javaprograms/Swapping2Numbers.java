package javaprograms;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping the values of a = "+a+"and b = "+b );
		
		
		
		  a= a*b;
		  b= a/b; 
		  a= a/b;
		 System.out.println("After swapping the values of a= "+a+ "and b ="+b);
		 
	}

}
