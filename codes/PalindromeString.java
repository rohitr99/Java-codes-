package codes;



public class PalindromeString {
	public static void main(String [] args) {
		String rev= "";
String str= "bob";
String org=str;
 int len= str.length();
 for(int i=len-1;i>=0;i--) {
	rev= rev+ str.charAt(i);
	
 }
// System.out.println(rev);
// System.out.println(org);
// System.out.println(org.equals(rev));
 
 if(org.equals(rev)) {
	 System.out.println( " It is a palindrome");
	 
 }
 else {
	 System.out.println(" It is not a palindrome");
	 
 }
}

}
