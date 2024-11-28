package collection;

public class Recursivesum {
	public static void sum(int n) {
		//int n = 123;
		int sum =0;
		while(n!=0) {
			int d = n%10;
			sum = sum +d;
			n/=10;	
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int num = 123;
		sum(num);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
