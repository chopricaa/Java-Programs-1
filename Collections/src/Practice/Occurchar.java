package Practice;
import java.util.*;

public class Occurchar {
	public static void main(String[] args) {
		String sr = "javaprogrammingiseasy";
		char[] charray = sr.toCharArray();
		HashMap<Character, Integer> hs = new HashMap<>();
		for(char c : charray) {
			System.out.println(c);
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			}
			else {
				hs.put(c, 1); 
			}
		}
		for(Map.Entry<Character, Integer> entry : hs.entrySet()) {
			System.out.println("Character: " + entry.getKey() + " Occurrences: " + entry.getValue());
		}
	}
}

