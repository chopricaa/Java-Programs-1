package collection;

public class Missingnum {
	public static void main(String[] args) {
		int sum=0;
		int[] arr = {1,3,4,5};
		int n = arr[arr.length-1];
		int output = n*(n+1)/2;
		for(int i=0;i<arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(output-sum);
		
		
	}

}


