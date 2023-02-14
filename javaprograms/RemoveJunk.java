package javaprograms;

public class RemoveJunk {

	public static void main(String[] args) {
		String a = "234£$%% java £$% program";
		String b = "$&£1200Cash";
		String replaced = a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaced);
		String replaced2 = b.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(replaced2);

	}

}
