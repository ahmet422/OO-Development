package BakeryBellisimo;

public abstract class Cake {
	String description = "Simple Cake";
	  
	public String getDescription() {
		return description;
	}
 
	public abstract double price();

}
