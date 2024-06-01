package codes;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	int arr[]= {12,10,5,17,25,30};
    System.out.println("Array before sort is" +" "+ Arrays.toString(arr));
    int h= arr.length;
    for(int i=0;i<h-1;i++) { //no of passes
    	for(int j=0;j<h-1;j++) { //  no of iterations
    		if(arr[j]>arr[j+1]) {
    			int temp=arr[j];
    			arr[j]=arr[j+1];
    		    arr[j+1]=temp;
    		}
    	}
    }
    System.out.println("Array after sort is" +" "+ Arrays.toString(arr));
    
	}

}
