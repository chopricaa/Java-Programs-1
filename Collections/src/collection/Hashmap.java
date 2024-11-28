package collection;
import java.util.*;

// HASH MAP KEY VALUE PAIR
public class Hashmap {
	public static void main(String[] args) {
	HashMap <String, Integer> map = new HashMap<>();
	 map.put("Apple", 3);
     map.put("Banana", 2);
     map.put("Orange", 5);
     map.put("Mango", 7);
     
     for(Map.Entry <String, Integer> entry : map.entrySet()) {
    	 System.out.println("String is :" + entry.getKey() + "Value is :" + entry.getValue());
    	 
     }
     
	}

}
