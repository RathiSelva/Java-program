package javaprograms;

import java.util.Arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {

		int array[] = { 1, 0, -1, 23, 45, 7658 };
		Arrays.sort(array);

		System.out.println(array[0]);

		System.out.println(array[array.length - 1]);

		int largest = array[0];
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest =array[i] ;

			} else if (array[i] < smallest)
				
			{
				 smallest =array[i] ;
				

				}

		}	
		System.out.println(smallest);
		System.out.println(largest);
		
		
	}}

