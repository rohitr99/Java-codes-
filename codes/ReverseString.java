package codes;

public class ReverseString {
	public static void main(String [] args) {
		String str= "rohit";
		String rev="";
		int len= str.length();           //4
		for (int i= len-1;i>=0;i--) {    //3
			rev = rev+ str.charAt(i);
			
		}
		System.out.println("The reverse string is\n"+ rev);
	
	}
}
