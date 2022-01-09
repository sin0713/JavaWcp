package noName;

public class Main {
	public static void main(String[] args) {
		A a = new A() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		
		B b = new B() {
			@Override
			public String hello() {
				return "Hello B!";
			}
		};
		
		
		System.out.println(b.hello());
		System.out.println(a.hello());
		
		
	}
}

