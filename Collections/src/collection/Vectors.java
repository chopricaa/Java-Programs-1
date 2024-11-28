package collection;
import java.util.Vector;
import java.util.Scanner;

public class Vectors {
	public static void main(String[] args) {
		//Vector<Integer> vs = new Vector<>();
		Vector<Integer> vs = new Vector<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			vs.add(i);
		}
		System.out.println(vs);
		vs.add(2,5);
		System.out.println(vs);
		vs.remove(1);
		System.out.println(vs);
		vs.set(2, 7);
		System.out.println(vs);
		System.out.println(vs.clone());
		System.out.println(vs.capacity());
		
	}

}
