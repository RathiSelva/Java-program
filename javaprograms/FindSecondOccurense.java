package javaprograms;

public class FindSecondOccurense {

	public static void main(String[] args) {
		String s = "java core is used in selenium java jo";
		int index = s.indexOf("j");
		System.out.println(index);
		int index2 = s.indexOf("j",s.indexOf("j")+1);
		
		System.out.println(index2);
		
	}

}
