package javaprograms;

public class MissingNumber {
//1.create no array
//2.add all values in the array
	//by iteration with one variable
	//3.find the total value of sequence given
	//4.by subtracting first from second .
	public static void main(String[] args) {
		int a[] = {1,2,4,5,6};
		int sum =0;
		 int size =a.length;
		 System.out.println(size);
		for(int i =0;i<size; i++) {
			sum =sum+a[i];
			
		}
		System.out.println(sum);
		 int sum1 =0;
		for (int j=1; j<=6;j++) {
			sum1 =sum1+j;
			
			
		}
	System.out.println(sum1);	
		int missed = sum1 -sum ;
	
	System.out.println("The Missing Number in the sequence is "+ missed);
	}

}
