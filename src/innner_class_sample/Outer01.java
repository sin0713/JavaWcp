package innner_class_sample;

public class Outer01 {
	private String greeting = "こんにちは";
	
	public class Inner {
		public String hello() {
			return greeting;
		}
	}

}
