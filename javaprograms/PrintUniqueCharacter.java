package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name = "babu";
		char[] charArray = name.toCharArray();

		Set<Character> unique = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean add = unique.add(charArray[i]);
			if (!add) {
			System.out.println("The Duplicate Character is = "+charArray[i]);
			
				unique.contains(charArray[i]);
				unique.remove(charArray[i]);
			}

			else {

				unique.add(charArray[i]);
			}
		}
		System.out.println(unique);

	}

}
