//package Practice;
//import java.util.*;
//
//class product{
//	private String name;
//	private double price;
//	private int quantity;
//	
//	public product(String name, double price, int quantity) {
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//	}
//	public String getName() {
//		return name;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public int getQuantity() {
//		return quantity; 
//	}
//	public void setQuantity(int qunatity) {
//		this.quantity = quantity;
//		
//	}
//	
//}
//class Inventory1{
//	private ArrayList<Product> products;
//	
//	 public Inventory1() {
//	     products = new ArrayList<>();
//	 }
//	 public void addProduct(Product product) {
//		 for(Product p : products) {
//			 if(p.getName() .equalsIgnoreCase(product.getName())){
//				 p.setQuantity(p.getQuantity() + product.getQuantity());
//				 System.out.println("Updated quantity :" +p.getName());
//			
//			 }
//			 products.add(product);
//			 System.out.println("New product has been added");
//				 
//		 }
//    }
//	 
//	public void removeProduct(String productName) {
//		products.removeIf(p -> p.getName() .equalsIgnoreCase(productName));
//		System.out.println("Removed pro" + productName);
//	}
//	
//	public void displayProducts() {
//		System.out.println("Display");
//		for(Product p : products) {
//			System.out.printf("Name : %s, price is :%2f, quantity is : %d%n", p.getName(), p.getPrice(), p.getQuantity());
//			
//		}
//	}
//	
//	public double getTotalInventoryValue() {
//		double totalValue  = 0;
//		for(Product p : products) {
//			totalValue += p.getPrice() * p.getQuantity();
//		}
//		return totalValue;
//   }
//	
//
//}
//
//
//public class Inventmanage{
//	public static void main(String[] args) {
//		Inventory1 ob = new Inventory1();
//		ob.addProduct(new Product("Laptop", 1200.50, 5));
//	    ob.addProduct(new Product("Phone", 800.00, 10));
//	    ob.addProduct(new Product("Tablet", 500.00, 7));
//
//	}
//
//}
