package Practice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {    
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream()
                                          .filter(n -> n % 2 != 0)
                                          .collect(Collectors.toList());
        System.out.println("Original List: " + numbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}

