package codes;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the  first no to find largest one");
		int a=sc.nextInt();
		System.out.println("Enter the  second no to find largest one");
		int b=sc.nextInt();
		System.out.println("Enter the third no to find largest one");
		int c= sc.nextInt();
		int largest= a>b?a:b;
		int largest2= c>largest?c:largest;
		System.out.println("The largest number is="+largest2);
	}

}
