package stream;

import java.util.ArrayList;
import java.util.List;
class Product1{
	int id;
	String designation;
	float price;
	public Product1(int id, String designation, float price) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
	}
}
public class FilteringIteratingCollection {

	public static void main(String[] args) {
		List<Product1> products = new ArrayList<>();
		products.add(new Product1(1, "Product1", 1));
		products.add(new Product1(2, "Product2", 2));
		products.add(new Product1(3, "Product3", 3));
		products.add(new Product1(4, "Product4", 4));
		products.add(new Product1(5, "Product5", 5));
		
		products.stream().filter(p->p.price == 3).forEach(s->System.out.println(s.designation));

	}

}
