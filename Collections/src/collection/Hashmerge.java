package collection;
import java.util.*;


public class Hashmerge {
	public static void main(String[] args) {
		HashMap <String, Integer> map1 = new HashMap<>();
		map1.put("Apple", 10);
	    map1.put("Banana", 15);
	    map1.put("Orange", 20);
	    map1.put("Mango", 35);
	    HashMap <String, Integer> map2 = new HashMap<>();
        map2.put("Banana", 25);  // This key exists in map1 and will be overwritten
        map2.put("Mango", 30);
        map2.put("Grapes", 35);
        
        map1.putAll(map2);
        System.out.println(map1);
        
        for(Map.Entry<String, Integer> element : map1.entrySet()){
        	System.out.println("String is: " + element.getKey() + "Value is" + element.getValue());
        }
	    
	    
	        
	   
	        
		
	}

}
