package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String designation;
	float price;
	public Product(int id, String designation, float price) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
	}
	
}
public class Filtering {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Product1", 1));
		products.add(new Product(2, "Product2", 2));
		products.add(new Product(3, "Product3", 3));
		products.add(new Product(4, "Product4", 4));
		products.add(new Product(5, "Product5", 5));
		
		List<Float> result = products.stream().filter(p->p.price>4).map(p->p.price).collect(Collectors.toList());
		System.out.println(result);
	}

}
