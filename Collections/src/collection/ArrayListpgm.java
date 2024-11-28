package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListpgm{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();  
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());  
            }
            data.add(row);  
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();  
            int y = sc.nextInt();  
            if (x <= data.size() && x > 0 && y <= data.get(x - 1).size() && y > 0) {
                System.out.println(data.get(x - 1).get(y - 1));  
            } else {
                System.out.println("ERROR!");  
            }
        }
    
        sc.close();
     
   }
}    


