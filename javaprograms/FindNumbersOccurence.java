package javaprograms;
	import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

	
	public class FindNumbersOccurence {
		public static void main(String[] args) {
			int[] arrayNo = { 2,3,5,6,3,2,1,4,2,1,6,-1 };

			Map<Integer, Integer> fOcc = new HashMap<Integer, Integer>();
			
			for (int i = 0; i < arrayNo.length; i++) {
				Integer default1 = fOcc.getOrDefault(arrayNo[i],0);
				fOcc.put(arrayNo[i],default1+1);}
			System.out.println(fOcc);	
				
			}
}
