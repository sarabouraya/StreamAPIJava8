package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product6{
	int id;
	String designation;
	float price;
	public Product6(int id, String designation, float price) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
	}
}

public class RemoveRedandantBySet {
	public static void main(String[] args) {
			List<Product6> products = new ArrayList<>();
			products.add(new Product6(1, "Product1", 1));
			products.add(new Product6(2, "Product2", 2));
			products.add(new Product6(3, "Product3", 3));
			products.add(new Product6(4, "Product4", 4));
			products.add(new Product6(5, "Product5", 5));
			products.add(new Product6(5, "Product5", 5));
			
			Set<Float> mySet = 
					products.
					stream().
					filter(p->p.price>3).
					map(p->p.price).
					collect(Collectors.toSet());
			System.out.println(mySet);
	}
}
