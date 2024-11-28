package collection;

public class Palindrome {
	public static void main(String[] args) {
		String a = "madam";
		String r = "";
		for( int i=a.length()-1; i>=0; i--) {
			r += a.charAt(i);
			
		}
		if(a.equals(r)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
	

}
