package codes;

public class MaxAndMinNoInArray {

	public static void main(String[] args) {
	int arr[]= {10,12,8,15,50,18};
		int max= arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}	
		}
		System.out.println("The maximum no in an array is ="+max);
		
		int min= arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The minimum no in an array is ="+min);

	}

}
