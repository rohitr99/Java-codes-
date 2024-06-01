package codes;

public class MissingNoInArray {
	public static void main(String [] args) {
		int [] a= {1,2,4,5};
		int sum=0;
		int sum2=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of an array is="+sum);
		for(int i=0;i<=5;i++) {
			sum2=sum2+i;
		}
		System.out.println("The sum of an array is="+sum2);
		System.out.println("The missing number in an array is="+(sum2-sum));
	}
		
}
