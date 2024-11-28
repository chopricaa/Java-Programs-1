package collection;
import java.util.Scanner;

public class Vowels {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		
		for(char c : str.toCharArray()) {
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				count++;
		}
			
		}
		System.out.println(count);
		
		
		
		
	}

}
