package collection;

import java.util.*;
class Product{
private String name;
private double price;
private int quantity;

public Product(String name, double price, int quantity){
this.name = name;
this.price = price;
this.quantity = quantity;
}

public String getName(){
return name;
}

public double getPrice(){
return price;
}

public int getQuantity(){
return quantity;
}

public void setQuantity(int quantity){
this.quantity = quantity;
}

}

class Inventory{
private ArrayList<Product> products;

public Inventory(){
this.products = new ArrayList<>();
}

public void addProduct(Product product){
for(Product p : products){
if(p.getName() .equalsIgnoreCase(product.getName())){
p.setQuantity(p.getQuantity() + product.getQuantity());
System.out.println("After updating Products are" +product.getName());
}
}
products.add(product);
System.out.println("After adding a new product" +product.getName());
}

public void removeProduct(String productName){
products.removeIf(p -> p.getName() .equalsIgnoreCase(productName));
System.out.println("After removing the product" +productName);
}

public void displayAll(){
for(Product p : products){
System.out.println("Name is:" +p.getName() + "price is :" +p.getPrice() + "Qunatity is:" +p.getQuantity());
}
}

public double  TotalInventoryValue(){
double total = 0;
for(Product p : products){

total += p.getPrice() * p.getQuantity();
}
return total;
}
}

public class invent{
public static void main(String[] args){
Inventory in = new Inventory();
in.addProduct(new Product("Flour", 45.00 , 1));
in.addProduct(new Product("Fruits", 150.00 , 3));
in.addProduct(new Product("Cosmetics", 1500.00 , 4));
in.addProduct(new Product("Pens", 20.00 , 2));
in.addProduct(new Product("Book", 90.00 , 5));
in.removeProduct("Pens");
in.displayAll();
System.out.println(in.TotalInventoryValue());
}
}
