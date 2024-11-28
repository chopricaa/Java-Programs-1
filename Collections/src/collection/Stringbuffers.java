package collection;

import java.util.Scanner;

//STRING BUFFERS
//THREAD SAFETY
//SYNCHRONISED


//public class Stringbuffers {
//	public static void main(String[] args) {
//		
//		//ways of string creation
//		String str1 = new String("ABC");
//		String str2 = "PQR1";
//		System.out.println(str1 + str2);
//		StringBuffer sb1 = new StringBuffer("wxyz");
//		System.out.println(sb1.append("asd"));
//		System.out.println(sb1.reverse());
//		System.out.println(sb1.charAt(2));
//		
//	}
//
//}



// STRING BUILDERS
// NOT THREAD SAFE
// NOT SYNCHRONISED
//public class Stringbuffers{
//	public static void main(String[] args) {
//		StringBuilder sb1 = new StringBuilder("qwes");
//		System.out.println("String1= " + sb1.toString());
//		System.out.println(sb1);
//		sb1.append("rtyui");
//		sb1.reverse();
//		sb1.substring(2,5);
//		sb1.replace(1,3,"java");
//		
//	}
//}

public class Stringbuffers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		StringBuilder sb1 = new StringBuilder(str1);
		System.out.println(sb1.length());
		System.out.println(sb1.indexOf("I"));
		System.out.println(sb1.charAt(3));
		//System.out.println(sb1 + "ANSWERS");
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		//str2 = str1.concat("ANSWERS");
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
		
		
		
		
		
	}
}






