package codes;

import java.util.Scanner;

public class PalendromeNum {
	public static void main(String [] args) {
		System.out.println("Enter the number to check palindrome or not");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int original=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		
		if(rev==original) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is  not palindrome");
		}
		
	}
}
