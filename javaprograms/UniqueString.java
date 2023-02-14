package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class UniqueString {

	public static void main(String[] args) {
		String passage = "world wide web in all over world wide";
		String[] word = passage.split(" ");
		Set<String> indWord = new HashSet<String>();
		for (int i = 0; i < word.length; i++) {
			boolean add = indWord.add(word[i]);

			if (!add) {
				indWord.contains(word[i]);
				indWord.remove(word[i]);

			} else {
				indWord.add(word[i]);}
		}
				System.out.println(indWord);

			}
		}
	

// System.out.println(indWord);
