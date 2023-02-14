package javaprograms;
import java.util.Arrays;
public class Palindrome {

	public static void main(String[] args) {
		
		String original = "racecar";
		//String replace = original.replace(" ", "");
		char[] charA =original.toCharArray();
		int length = charA.length;
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse+ charA[i];}
			System.out.println(reverse);
			
		  if(reverse.equals(original)) { 
				System.out.println(original + "  is a Palindrome"); 
				}
			 else { System.out.println(original + " is not a Palindrome"); }
			  
			 }
			 
		

	}

