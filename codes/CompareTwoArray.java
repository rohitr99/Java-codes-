package codes;

public class CompareTwoArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,4,5,7};
		int arr2[]= {1,2,4,5,7};
		boolean status= true;
		if(arr1.length==arr2.length) {
			for(int i=0; i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					status =false;
				}
					
			}
		}
		else {
			status=false;
		}
		if(status== true) {
			System.out.println("arrays are same");
		}
		else {
			System.out.println("arrays are not same");
		}

	}

}
