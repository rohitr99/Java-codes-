package codes;

import java.util.Scanner;

public class Primeno {
	// two conditions--> 1) num>1 2) factorial of 1 and itself or divisible by one and itself

	public static void main(String[] args) {
		System.out.println("Enter number to check prime or not");
		Scanner sc= new Scanner(System.in);
		int count=0;
		int num= sc.nextInt();
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
				if(count==2) {
					System.out.println("It is a prime number");
				}
				else {
					System.out.println("Not a prime number");
				}
			
		}
	}

}
