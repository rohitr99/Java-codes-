package codes;

import java.util.Scanner;

public class Swapping {
	public static void main(String [] args) {
		System.out.println("enter number to swap");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b = sc.nextInt();
		System.out.println("after swapping number is\n"+a+" ,"+b);
		// now swapping the numbers
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping number is\n"+a+" ,"+b);
	}
	}


