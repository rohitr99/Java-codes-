package codes;

public class DublicateElementInAnArray {
	public static void main(String[] args) {
		int arr[]= {10,19,15,10,15,65};
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Dublicates are found ="+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Dublicates are not found ");
		}
	}
}
