package codes;

import java.util.Random;

public class RandomNumber {
	//approach 1--->
	public static void main(String[] args) {
		Random rand= new Random();
		int randans=rand.nextInt(100);
		double randans1= rand.nextDouble(10);
		System.out.println(randans);
		System.out.println(randans1);
	

//approach 2--->
System.out.println(Math.random());
}
}