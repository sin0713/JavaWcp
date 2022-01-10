package Stream;

public class Fruit {
	public String name;
	public int quantity;
	
	
	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public Fruit order(int quantityToAdd) {
		return new Fruit(this.name, this.quantity + quantityToAdd);
	}
	
	@Override
	public String toString() {
		return name + ": " + quantity + "個";
	}

}
