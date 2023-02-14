package javaprograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 234;
		StringBuffer sb = new StringBuffer(String.valueOf(num));

		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		int reve = 0;
		while (num > 0) {
			reve = reve * 10 + num % 10;
			num = num / 10;}
			
		
		System.out.println(reve);

		

	}

}
