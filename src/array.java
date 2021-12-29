
import java.util.Arrays;
public class array {
	public static void main(String[] args) {
		int[] array1 = new int[3];
		array1[0] = 60;
		array1[2] = 20;
		array1[1] = 20;
		int int2 = array1[2];
		System.out.println(int2);

		int array2[] = null;
		System.out.println(array1[2]);
		System.out.println(Arrays.toString(array1));

		int[] array3 = new int[] {10, 20, 50};
		int[] array4 = {10, 20, 50};

		System.out.println(Arrays.toString(array3));
	}
}
