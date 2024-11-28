package collection;

public class Boxes <T>{
private T item;
public void add(T item){
this.item = item;
}
public  T get(){
return item;
}
public static void main(String[] args){
Boxes<Integer> bx = new Boxes<>();
bx.add(24);
System.out.println(bx.get());
Boxes<String> bx1 = new Boxes<>();
bx1.add("Chopricaa");
System.out.println(bx1.get());
}
}