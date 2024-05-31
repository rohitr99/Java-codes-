package codes;

import java.util.Scanner;

public class Reverse {
public static void main(String [] args) {
	System.out.println("Enter the number to reverse");
	Scanner sc= new Scanner(System.in);//1234
	int num= sc.nextInt();
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num= num/10;
	}
	System.out.println("the reverse number is\n"+rev);
}
}
