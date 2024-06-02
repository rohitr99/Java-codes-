package codes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a= "listent";
		String b= "tlisten";
		if(a.length()!= b.length()) {
			System.out.println("Not anagram");
		}
		char [] a1 = a.toCharArray();
		char [] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		//System.out.println(a1);
		//System.out.println(b1);
		boolean result =true;
		for(int i=0; i<a1.length;i++) {
			if(a1[i]!=b1[i]) {
				result= false;
				break;
				
			}
		}
		if(result) {
			System.out.println("It is anagram");
			
		}
		else {
			System.out.println("Not anagram");
		}
		

	}

}
