package codes;
// 0 1 1 2 3 5 8 13 21 34
public class Fabonacii {

	public static void main(String[] args) {
		int n1=0, n2=1;
		for(int i=0; i<10;i++) {
		 int 	sum=n1+n2;
		 System.out.println(sum);
		 n1=n2;
		 n2=sum;
		 
			
		}

	}

}
