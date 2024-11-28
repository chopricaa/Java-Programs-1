package Practice;

import java.util.Arrays;
class Thirdlargest{ 

	public static int thirdlargest(int[] arr) 
	{ 
		int n = arr.length;  
		if (n < 3) { 
			System.out.println("Invalid Input"); 
			return 0; 
		} 
		else { 
			Arrays.sort(arr); 
			return arr[n- 3]; 
		} 
	} 
	public static void main(String[] args) 
	{  
		int[] arr = { 12, 13, 1, 10, 34, 16 }; 
		System.out.println(thirdlargest(arr)); 
	} 
}
