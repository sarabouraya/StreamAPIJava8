package stream;

import java.util.ArrayList;
import java.util.List;

class Product5{
	int id;
	String designation;
	float price;
	public Product5(int id, String designation, float price) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
	}
}
public class Count {
	public static void main(String[] args) {
		List<Product5> products = new ArrayList<>();
		products.add(new Product5(1, "Product1", 1));
		products.add(new Product5(2, "Product2", 2));
		products.add(new Product5(3, "Product3", 3));
		products.add(new Product5(4, "Product4", 4));
		products.add(new Product5(5, "Product5", 5));
		
		long count = products.stream().filter(p->p.price>4).count();
		System.out.println(count);
	}
}
