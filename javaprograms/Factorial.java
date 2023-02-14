package javaprograms;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact * i;
		}
		{
			System.out.println("factorial of the number 5 is" + fact);

		}

		
	int num = 12;
	int count =1;
	for(int i = 1; i<=num;i++) {
	count = count*i;
	}
	System.out.println(count+ " is the factorial value of 12");
	}

}
