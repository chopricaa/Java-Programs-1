package Practice;

public class RotateArray {
	static void rotate(int arr[], int n, int k) {
		int mod = k % n;
		for(int i=0;i<n;++i) {
			System.out.println(arr[(i+mod)%n]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {3,4,5,7,9,12};
		int k = 2;
		int n = arr.length;
		rotate(arr,n,k);
		k=3;
		rotate(arr,n,k);
		k=14;
		rotate(arr,n,k);
			
		
	}

}
