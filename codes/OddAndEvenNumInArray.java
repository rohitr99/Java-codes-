package codes;

public class OddAndEvenNumInArray {
	public static void main(String [] args) {
		int arr[]= {1,4,2,5,7,9,5};
		int len= arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i]%2==0) {
				System.out.println("The even list number is"+arr[i]);
			}
			else {
				System.out.println( "The odd number list is"+arr[i]);
			}
		}
	}
}
