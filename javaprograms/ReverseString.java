package javaprograms;

public class ReverseString {

	public static void main(String[] args) {
		String a = "Automation";
		char[] array = a.toCharArray();
		 int size = array.length;
		 String rev ="";
		for( int i=size-1; i>=0; i--) {
			rev = rev+ array[i];
		}
		System.out.println(rev) ;
	}

}
