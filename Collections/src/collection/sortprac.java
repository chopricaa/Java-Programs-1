package collection;

public class sortprac {
	public static void main(String[] args) {
		int[] arr1 = {10,54,67,34};
		int[] arr2 = {39,43,87,90};
		int a1 = arr1.length;
		int a2 = arr2.length;
		int a3 = a1+a2;
		int[] arr3 = new int[a3];
		for(int i=0;i<a1;i++) {
			arr3[i] = arr1[i];
		}
		for(int i=0;i<a2;i++) {
			arr3[a1+i] = arr2[i];
		}
		for(int i=0;i<a3;i++) {
			System.out.println(arr3[i]);
		}
		for(int i=0;i<a3-1;i++) {
			for(int j=i+1;j<a3-1-i;j++) {
				if(arr3[j]>arr3[j+1]) {
					int temp=arr3[j];
					arr3[j] = arr3[j+1];
					arr3[j+1]=temp;					
				}
			}
			
		}
		for(int i=0;i<a3;i++) {
			System.out.println(arr3[i]);
			
		}
		
		
	}

}
