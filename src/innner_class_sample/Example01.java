package innner_class_sample;

public class Example01 {
	public static void main(String[] args) {
		Outer01 outer = new Outer01();
		Outer01.Inner inner = outer.new Inner();
	}
}
