package collection;

public class Strings {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.append(false);
		System.out.println(sb);
		sb.insert(4,"pink");
		sb.replace(1,3,"blue");
		sb.reverse();
		System.out.println(sb);
		sb.indexOf("pink");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.length();
		System.out.println(sb);
		sb.toString();
		System.out.println(sb);
		//for(String i : sb) {
		//System.out.println(sb);
		//}
		
		
	}

}
