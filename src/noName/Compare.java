package noName;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
		List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");
		
		Collections.sort(
				numbers,
				new Comparator<Integer>() {
					@Override
					public int compare(Integer x, Integer y) {
						return Integer.compare(x, y);
					}
				});
		
		System.out.println(numbers);
		System.out.println("---------------------");
		
		Collections.sort(
			    animals,
			    new Comparator<String>() {
			      @Override
			      public int compare(String x, String y) {
			        return x.compareTo(y);
			      }
			    });
		
		System.out.println(animals);
	}
	
	
	
	

}
