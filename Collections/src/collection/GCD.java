package collection;

public class GCD {
	public static int gcd(int a , int b) {
		if(b==0) {
			return a;
		}
		return gcd(a,a%b);
	}

	public static void main(String[] args) {
		int a = 21;
		int b =45;
		System.out.println(gcd(21,43));
		// TODO Auto-generated method stub

	}

}
