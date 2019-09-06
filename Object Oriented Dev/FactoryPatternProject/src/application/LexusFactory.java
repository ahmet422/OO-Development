package application;

public class LexusFactory extends Factory {

	@Override
	public AutoOil makeOil() {
		// TODO Auto-generated method stub
		return new OilForLexus();
	}

	@Override
	public BrakeFluid makeBrakeFluid() {
		// TODO Auto-generated method stub
		return new BrakeFluidForLexus();
	}

}
