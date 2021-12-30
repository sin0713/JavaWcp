
import java.util.Arrays;
public class chapter05 {
	public static void main (String[] args) {
		long long2 = 9223372036854775807L;
		short short1 = 32767;
		byte byte1 = 127;
		String str1 = "---------------------------------";
		System.out.println(long2);
		System.out.println(short1);
		System.out.println(byte1);
		System.out.println(str1);

		double double1 = 1234567.89d;
		float float1 = 0.123f;
		System.out.println(double1);
		System.out.println(float1);
		System.out.println(str1);

		boolean boolean1 = true;
		boolean boolean2 = false;
		System.out.println(boolean1);
		System.out.println(boolean2);
		System.out.println(str1);

		char char1 = 'あ';
		char char3 = 'A';
		// char char2 = 'AB'; コンパイルエラー　一文字のみ！
		char char4 = 0x3042; //文字コードの「あ」

		long long3 = 999999999999999999L;
		double double2 = 99.99d;
		boolean boolean3 = true;
		System.out.println(long3);
		System.out.println(double2);
		System.out.println(boolean3);
		System.out.println(str1);

		Integer i = 100;
		System.out.println(i);
		Float f = 3.14f;
		System.out.println(f);
		Character c = 'う';
		System.out.println(c);
		System.out.println(str1);

		int[] array1 = new int[] {10, 20, 30, 40, 50};
		System.out.println(array1[3]);
		System.out.println(Arrays.toString(array1));

	}

}
