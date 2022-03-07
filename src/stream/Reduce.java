package stream;

import java.util.ArrayList;
import java.util.List;
class Product2{
	int id;
	String designation;
	float price;
	public Product2(int id, String designation, float price) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
	}
}
public class Reduce {

	public static void main(String[] args) {
		List<Product2> products = new ArrayList<>();
		products.add(new Product2(1, "Product1", 1));
		products.add(new Product2(2, "Product2", 2));
		products.add(new Product2(3, "Product3", 3));
		products.add(new Product2(4, "Product4", 4));
		products.add(new Product2(5, "Product5", 5));
		float total = products.stream().map( p -> p.price).reduce(0.0f, (   sum ,  price) -> sum+price);
		System.out.println(total);
		
		float total1 = products.stream().map( p -> p.price).reduce(0.0f,Float::sum);
		System.out.println(total1);
	}

}
