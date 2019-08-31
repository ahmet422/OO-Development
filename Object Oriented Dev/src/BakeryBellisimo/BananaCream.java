package BakeryBellisimo;

public class BananaCream extends ToppingDecorator{
	public BananaCream(Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Banana Cream";
	}
	
	public double price() {
		return 1.2 + cake.price();
	}

}
