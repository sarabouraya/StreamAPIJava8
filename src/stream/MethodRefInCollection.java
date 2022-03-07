package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product7{
	int id;
	String designation;
	float price;
	public Product7(int id, String designation, float price) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
public class MethodRefInCollection {
	public static void main(String[] args) {
		List<Product7> products = new ArrayList<>();
		products.add(new Product7(1, "Product1", 1));
		products.add(new Product7(2, "Product2", 2));
		products.add(new Product7(3, "Product3", 3));
		products.add(new Product7(4, "Product4", 4));
		products.add(new Product7(5, "Product5", 5));
		
		List<Float> myList= products.stream().filter(p->p.price > 3).map(Product7::getPrice).collect(Collectors.toList());
		System.out.println(myList);
	}
}
