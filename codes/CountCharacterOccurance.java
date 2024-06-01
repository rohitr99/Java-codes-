package codes;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String str= "Java is a programing language";
		int len= str.length();
		int len1= str.replaceAll("a", "").length();
		System.out.println("the occurance of a character a  is = "+(len-len1));
		}
	
}
