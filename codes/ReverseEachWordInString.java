package codes;

public class ReverseEachWordInString {
	public static void main(String [] args) {
		String str = "welcome to java";
		String[] words= str.split(" ");
		 String reversestring ="";
		 for(String w: words) {
			  String reverseword= "";
			 for(int i=w.length()-1;i>=0;i--) {
				 reverseword= reverseword+w.charAt(i);
				// System.out.println(reverseword);
			 }
			 reversestring =reversestring + reverseword+" ";
		 }
		
		 System.out.println( reversestring);
	}
}
