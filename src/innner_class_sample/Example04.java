package innner_class_sample;

public class Example04 {
	public static void main(String[] args) {
		Human human = new Human();
		Human.HumanLeg leg = human.new HumanLeg();
		
		new Human().new HumanLeg().kick();
		
		leg.kick();
		
		
	}
	

}
