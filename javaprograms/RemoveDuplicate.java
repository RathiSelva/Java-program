package javaprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] num = {2,3,4,5,6,5,4,3};
		Set<Integer> noDuplicate = new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			noDuplicate.add(num[i]);}
			System.out.println(noDuplicate);
			
		}
}
	
// how to get the duplicates alone
/*int[] num = {2,3,4,5,6,5,4,3};
Set<Integer> noDuplicate = new HashSet<Integer>();
for (int i = 0; i < num.length; i++) {
	boolean add = noDuplicate.add(num[i]);
	if (!add) {
		System.out.println(num[i]);
	}

}}}*/

