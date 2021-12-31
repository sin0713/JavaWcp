
public class chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number >= 1 && number < 5) {
			System.out.println(number * number);
			number ++;
		}
		
		System.out.println("---------------------------------");
		
		int[] array = {1, 2, 3, 4};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("---------------------------------");
		
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
