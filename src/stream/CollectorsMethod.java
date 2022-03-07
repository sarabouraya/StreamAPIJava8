package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product3{
	int id;
	String designation;
	float price;
	public Product3(int id, String designation, float price) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
	}
}
public class CollectorsMethod {
 public static void main(String[] args) {
	 List<Product3> products = new ArrayList<>();
		products.add(new Product3(1, "Product1", 1));
		products.add(new Product3(2, "Product2", 2));
		products.add(new Product3(3, "Product3", 3));
		products.add(new Product3(4, "Product4", 4));
		products.add(new Product3(5, "Product5", 5));
		
		double total = products.stream().collect(Collectors.summingDouble(p->p.price));
		System.out.println(total);
		
}
}
