package innner_class_sample;

public class Outer02 {
	private static String greeting = "こんにちは";
	
	public static class Inner {
		public String hello() {
			return greeting;
		}
	}

}
