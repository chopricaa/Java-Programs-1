package collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEg {
    public static void main(String[] args) {
    	ArrayList<Integer> als  = new ArrayList<>();
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	for(int i=0;i<=n;i++) {
    		als.add(i);
    	}
    	System.out.println(als);
    	als.add(1,45);
    	als.get(3);
    	als.contains(76);
    	als.set(3, 567);
    //	System.out.println(als.indexOf(2));
    	System.out.println(als);
    	Iterator <Integer> itr = als.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());
    	}
    	
    	//List<String> sr = Arrays.asList("APPLE", "MANGO", "BANANA");
    	
    	
//    	als.forEach((k) -> print(k));
//    }
    	 
//    public static void print(Integer k) {
//    	System.out.println("result is" + k);
//    }
    
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Mango");
//        String fruit = fruits.get(1);  
//        fruits.remove("Mango");
//        int size = fruits.size();  
//        for (String f : fruits) {
//            System.out.println(f);
       }
}

