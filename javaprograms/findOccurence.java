package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class findOccurence {

	public static void main(String[] args) {
		/*
		 * String cName = "amazon forest";
		 * 
		 * String replace = cName.replace(" ", ""); //System.out.println(replace);
		 * char[] cArray = replace.toCharArray(); Map<Character, Integer> occurence =
		 * new HashMap<Character, Integer>(); for (int i = 0; i < cArray.length; i++) {
		 * if(occurence.containsKey(cArray[i])){ Integer value=
		 * occurence.get(cArray[i]); occurence.put(cArray[i], value+1);
		 * 
		 * } else { occurence.put(cArray[i],1); }
		 * 
		 * } System.out.println(occurence);
		 * 
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
		String a = "Congizant Company";
		char[] achar = a.toCharArray();
		Map<Character, Integer> occ = new HashMap<Character, Integer>();
		for (int i = 0; i < achar.length; i++) {
			if (occ.containsKey(achar[i])) {
				int value = occ.get(achar[i]);
				occ.put(achar[i], value + 1);
			} else {
				occ.put(achar[i], 1);
			}

		}
		System.out.println(occ);
	}
}
