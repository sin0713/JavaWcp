package Enum;

public class Main {
	public static void main(String[] args) {
		System.out.println(Dessert.APPLE);
		System.out.println(Dessert.ICE_CREAM);
		System.out.println(Dessert.CAKE);
		
		Dessert apple = Dessert.APPLE;
		Dessert iceCream = Dessert.ICE_CREAM;
		Dessert cake = Dessert.CAKE;
		
		
		System.out.println(cake);
		System.out.println(apple);
		System.out.println(iceCream);
		System.out.println("----------------------------");
		
		printDessertName(cake);
		printDessertName(apple);
		System.out.println("----------------------------");
		
		Dessert x = Dessert.APPLE;
		System.out.println(x == apple);
		System.out.println(x.equals(apple));
		System.out.println("----------------------------");
		
		System.out.println(Dessert.APPLE.name());
		
		Dessert apple02 = Dessert.valueOf("APPLE");
		System.out.println(apple02);
		System.out.println("----------------------------");
		
		System.out.println(apple.ordinal());
		System.out.println(cake.ordinal());
		System.out.println("------------------------------");
		
		System.out.println(apple.getPrice());
		System.out.println("------------------------------");
		
		apple.advertise();
		cake.advertise();
		iceCream.advertise();
		
		
		
	}
	
	static void printDessertName(Dessert dessert) {
		System.out.println(dessert);
	}

}
