package codes;

import java.util.Scanner;

public class Countno {
	public static void main(String [] args) {
		int count=0;
		System.out.println("Enter no to find number of digits");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();//1234
		while(num!=0) {
			int rem=num%10;
			count ++;
			num=num/10;
		}
		System.out.println("The total no of digit is="+count);
		
		
	
	}
}
