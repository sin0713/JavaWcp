package lamda;

public class Main {
	public static void main(String[] args) {
		Greeting01 greeting = () -> {
			return "hello world";
		};
		
		Greeting02 greeting2 = (String word) -> {
			  return word;
			};
		
		sayHello(greeting);
		System.out.println(greeting2.hello("Ciao!"));
		
	}
	
	public static void sayHello(Greeting01 g) {
		System.out.println(g.hello());
	}

}
