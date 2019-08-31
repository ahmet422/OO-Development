package BakeryBellisimo;

public class BakeryBellisimo {

	public static void main(String[] args) {
		
		System.out.println(" Wellcome to Bakery Bellisimo, Your order costs: " );
		Cake cake1 = new Tiramisu();
		System.out.println(cake1.getDescription() + " $ " + cake1.price());

		Cake cake2 = new CheeseCake();
		cake2 = new Nutella(cake2);
		cake2 = new Strawberry(cake2);
		System.out.println(cake2.getDescription() + " $ " + cake2.price());
		
		Cake cake3 = new ChocolateCake();
		cake3 = new BananaCream(cake3);
		cake3 = new Nutella(cake3);
		cake3 = new Nutella(cake3);
		System.out.println(cake3.getDescription() + " $ " + cake3.price());
		
		Cake cake4 = new FrenchSilk();
		cake4 = new Strawberry(cake4);
		System.out.println(cake4.getDescription() + " $ " + cake4.price());
		
		System.out.println(" Thank you for coming, See you soon ... " );
	}

}
