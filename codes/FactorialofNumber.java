package codes;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		int fact=1;
		System.out.println("Enter number to find factorial");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();//4
		for(int i=1; i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("the factorial of a number is= "+fact);

}
}
