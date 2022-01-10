package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main02 {
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit("りんご", 7));
		fruits.add(new Fruit("みかん", 15));
		fruits.add(new Fruit("いちご", 4));
		fruits.add(new Fruit("メロン", 8));
		fruits.add(new Fruit("ぶどう", 20));

		fruits.stream()
		.filter(f -> f.quantity <= 10)
		.map(f -> f.order(20))
		.sorted((f1, f2) -> f1.quantity - f2.quantity)
		.forEach(System.out::println);
		System.out.println("------------------------------");

		long count = fruits.stream()
		.filter(f -> f.quantity <= 10)
		.count();

		System.out.println(count);
		System.out.println("-------------------------------");

		List<Fruit> sortedFruits = fruits.stream()
	             .sorted((f1, f2) -> f2.quantity - f1.quantity)
	             .collect(Collectors.toList());

		System.out.println(sortedFruits);

	}

}
