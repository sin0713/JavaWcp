package practice;

public class chapter15_1 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b) + "です。");
	}
	
	static int gcd(int a, int b) {
		int rnum = a % b;
		
		while (rnum > 0) {
			a = b;
			b = rnum;
			rnum = a % b;				
		}
		return b;
	}

}
