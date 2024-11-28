package collection;
import java.util.Scanner;


public class Twodimenarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=3;
		int n=3;
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			arr[i][i] = 0;
			arr[i][arr.length-1-i]=0;
			
		}
		//2d to 1d
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

		
		
		
	}

}
