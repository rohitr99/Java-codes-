package codes;

import java.util.Arrays;

public class BinarySearchOfAnArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};// Should be sorted order.
         int key= 3;
         boolean flag=false;
         int l=0;
         int h= arr.length-1;
         while(l<=h) {
        	 int m= (l+h)/2;
        	 if(arr[m]==key) {
        		 System.out.println("Element found" );
        		
        		 flag= true;
        		 break;
        	 }
        	 if(key>arr[m]){
        	   l=m+1;	 
        	 }
        	 if(key<arr[m]) {
        		 h=m-1;
        	 }
         }
         if(flag==false) {
        	 System.out.println("Element not foud"); 
         }
       //  System.out.println( Arrays.binarySearch(arr, 5));  
	}

}
