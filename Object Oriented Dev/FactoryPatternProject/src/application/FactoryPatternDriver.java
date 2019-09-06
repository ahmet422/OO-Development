package application;

public class FactoryPatternDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client1 = new Client("Lexus"); // oil, brake fluid and antifreeze liquids for Lexus
		Client client2 = new Client("Jeep"); //  oil, brake fluid and antifreeze liquids for Jeep
	
		
		client1.order();
		
		client2.order();
		

	}

}
