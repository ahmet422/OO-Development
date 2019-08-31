package BakeryBellisimo;

public class Strawberry extends ToppingDecorator {
	
	public Strawberry(Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Strawberry";
	}
public double price() {
	return 1 + cake.price();
}
}
