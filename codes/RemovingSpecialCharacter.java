package codes;

public class RemovingSpecialCharacter {
	public static void main(String[] args) {
		String s1= "@##! The developer @@ j#@@ob is so easy";
	 s1.replaceAll("[A-Za-z0-9]", "");
		System.out.println( s1.replaceAll("[^A-Za-z0-9]", ""));
		
	}
}
