package codes;

import java.util.Scanner;

public class CountEvenodd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check even and odd no");
		int evencount=0;
		int oddcount=0;
		int num=sc.nextInt();//1234;
		while(num!=0) {
			int rem=num%10;
			if(rem%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("The no of even number is\n"+evencount);
		System.out.println("The no of odd number is\n"+oddcount);
		

	}

}
