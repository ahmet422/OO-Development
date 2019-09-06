package application;

public class JeepFactory extends Factory {

	@Override
	public AutoOil makeOil() {
		// TODO Auto-generated method stub
		return new OilForJeep();
	}

	@Override
	public BrakeFluid makeBrakeFluid() {
		// TODO Auto-generated method stub
		return new BrakeFluidForJeep();
	}

}
