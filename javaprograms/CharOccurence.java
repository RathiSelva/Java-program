package javaprograms;

public class CharOccurence {

	public static void main(String[] args) {
		String s = "java and maven in selenium";
		int size = s.length();
		
		String replace = s.replace("a", "");
		int size1 =replace.length();
		int count = size -size1;
		
		System.out.println("The total no of a present in given string is "+count);
		
				
	}

}
