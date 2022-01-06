package innner_class_sample;

public class Example02 {
	public static void main(String[] args) {
		Outer02 outer = new Outer02();
		Outer02.Inner inner = new Outer02.Inner();
		
		System.out.println(inner.hello()); 
	}
}
