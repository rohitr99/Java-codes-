package codes;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		System.out.println("Enter no to calculate sum");
		Scanner sc= new Scanner(System.in);//1234
		int rem=0;
		int num=sc.nextInt();
		while(num!=0) {
		 rem=rem+num%10;
		 num=num/10;
			
		}
		System.out.println("The sum of the number is="+rem);

	}

}
