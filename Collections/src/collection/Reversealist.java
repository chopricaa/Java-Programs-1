package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.*;


public class Reversealist {
	public static void main(String[] args) {
		List <Integer> ls = new ArrayList<>();
		ls.add(2);
		ls.add(5);
		ls.add(8);
		ls.add(34);
		ls.add(65);
		ls.add(34);
		Collections.sort(ls); // SORTING THE ARRAYS
		Collections.shuffle(ls); //TO SHUFFLE THE ARRAYX
		System.out.println(ls);
		System.out.println(ls.get(ls.size()-2)); // SECOND LARGEST ELEMENT IN THE LIST
//		Iterator <Integer> itr = ls.iterator(); // PRINTING USING ITERATOR
//		Collections.reverse(ls);
//		System.out.println(ls);
//		Set <Integer> sets = new HashSet<>(ls);
//		System.out.println(sets);
		List <Integer> lsi = new ArrayList<>();
		lsi.add(45);
		lsi.add(90);
		lsi.add(2);
		lsi.add(5);
//		ls.retainAll(lsi);      // RETAINSALL TO PRINT THE INTERSECTION ELEMENTS (BUIT - IN )
//		System.out.println(ls);
		List <Integer> intersect = new ArrayList<>();
		for(Integer num : ls) {                 // USED TO PRINT THE INTERSECTION ELEMENNTS USING LOOPS MANUALLY
			if(lsi.contains(num)) {
				intersect.add(num);
			}
		}
		System.out.println(intersect);
		
		List <String> ls3 = new ArrayList<>();
		
		ls3.add("Apple");
		ls3.add("Mango");
		ls3.add("pineapple");
		ls3.add("Melon");
		ls3.add("Apple");
		
		Map<String, Integer> freqmap = new HashMap<>();
		for(String num : ls3) {
			if(freqmap.containsKey(num)) {
				freqmap.put(num, freqmap.get(num) + 1);
			}
			else {
				freqmap.put(num, 1);
			}
		}
		System.out.println("elements frequiencies");
		for(Map.Entry<String, Integer> entry : freqmap.entrySet()) {
			System.out.println("Element is "+ entry.getKey() + "frequency is " + entry.getValue());
			
		}
		
		//		Collections.sort(ls3);
//		System.out.println(ls3);
		
				
		
		
		
		
		
		
		
	}

}
