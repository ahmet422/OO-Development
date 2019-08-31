package BakeryBellisimo;

public class Nutella extends ToppingDecorator{
	public Nutella(Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Nutella";
	}
	
	public double price() {
		return 1.5 + cake.price();
	}
	

}
