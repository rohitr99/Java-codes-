package codes;

import java.util.Scanner;

public class CountTheWords {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string to find count of the words");	
		String str=sc.nextLine();// Welcome to java
		int count=1;
		for(int i=0; i<str.length()-1;i++) {
			if( (str.charAt(i)==' ') && (str.charAt(i+1)!=0)) {
				count++;
				
			}
		}
		System.out.println("Occurance is=" + count);
		
	}
}
