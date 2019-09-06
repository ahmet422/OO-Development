package application;

public class FactoryMaker {
public static Factory getFactory(String factoryName) {
	if(factoryName.equals("Lexus")) return new LexusFactory();
	else if (factoryName.equals("Jeep")) return new JeepFactory();
	else return null;
}
}
