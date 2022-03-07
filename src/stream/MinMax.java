package stream;

import java.util.ArrayList;
import java.util.List;

class Product4{
	int id;
	String designation;
	float price;
	public Product4(int id, String designation, float price) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
	}
}

public class MinMax {
	public static void main(String[] args) {
		List<Product4> products = new ArrayList<>();
		products.add(new Product4(1, "Product1", 1));
		products.add(new Product4(2, "Product2", 2));
		products.add(new Product4(3, "Product3", 3));
		products.add(new Product4(4, "Product4", 4));
		products.add(new Product4(5, "Product5", 5));
		//min
		Product4 productMin = products.stream().min((p1,p2)->p1.price>p2.price ? 1:-1).get();
		System.out.println(productMin.price);
		//Max		
		Product4 productMax = products.stream().max((pr1,pr2) -> pr1.price > pr2.price ? 1:-1 ).get();
		System.out.println(productMax.price);
	}
}
