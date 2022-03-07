package stream;

import java.util.stream.Stream;

public class Interate {

	public static void main(String[] args) {
		Stream.iterate(1,e -> e+1).filter(e->e%5 == 0).limit(30).skip(2).forEach(System.out::println);

	}

}
