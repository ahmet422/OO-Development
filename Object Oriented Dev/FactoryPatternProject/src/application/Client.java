package application;

public class Client {
 
	private String carName;
	
	public Client( String newCarName) {
		carName = newCarName;
	}
	
	public void order() {
	
		System.out.println(" Wellcome to the ABC car maintenance. For your car you need to purchase: ");
		
		Factory f = FactoryMaker.getFactory(carName);
		
		AutoOil oil = f.makeOil();
		System.out.println(oil.getOilModel());
		
		BrakeFluid fluid = f.makeBrakeFluid();
		System.out.println( fluid.getFluidModel());
		
		System.out.println("XXXX brand of Antifreeze liquid \n"); // the same brand for Lexus, Jeep or any other car
	}
}
