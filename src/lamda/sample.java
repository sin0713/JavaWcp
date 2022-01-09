package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);
		
		Collections.sort(
				numbers,
				(x, y) -> {
					return Integer.compare(x, y);
				}
				);
		
		System.out.println(numbers);
	}
}
