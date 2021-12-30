
public class chapter06 {
	public static void main (String[] args) {
		int a = 15;
		int c;
		c = a + 3;
		System.out.println(c);
		c = a -5;
		System.out.println(c);
		System.out.println("-------------------------------");

		a = 10;
		a++;
		System.out.println(a);
		a--;
		System.out.println(a);
		System.out.println("-------------------------------");



		a = 5;
		c = ++a;
		System.out.println(a);
		System.out.println(c);

		a = 5;
		c = a++;
		System.out.println(a);
		System.out.println(c);
		System.out.println("-------------------------------");

		a = 10;
		a += 5;
		System.out.println(a);
		a -= 3;
		System.out.println(a);
		a *= 4;
		System.out.println(a);
		a /= 2;
		System.out.println(a);
		a %= 7;
		System.out.println(a);
		System.out.println("-------------------------------");

        a = 5;
		boolean d;

		d = a < 5;
		System.out.println(d);
		d = a <= 5;
		System.out.println(d);
		System.out.println("-------------------------------");

		String e = "100";
		String f = "200";
		String g;
		g = e + f;
		System.out.println(g);
		g = "あ" + "い";
		System.out.println(g);
		System.out.println("-------------------------------");

		String h = "applePie";
		String i = "apple";
		String j = i + "Pie";
		boolean k;
		k = h == j;
		System.out.println(k);
		String l = new String("applePie");
		k = h == l;
		System.out.println(k);

		k = h.equals(j);
		System.out.println(k);
		k = h.equals(l);
		System.out.println(k);
		System.out.println("=============================================");
		
		int val = 2 + 5;
		System.out.println(val);
		val ++;
		System.out.println(val);
		val *= 5;
		System.out.println(val);
		boolean bool = val == 50;
		System.out.println(bool);
		bool = val < 50 && val % 10 == 0;
		System.out.println(bool);

	}

}
