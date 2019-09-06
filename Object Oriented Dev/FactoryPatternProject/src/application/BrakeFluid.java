package application;

public abstract class BrakeFluid {

	protected String FluidModel;
	
	public BrakeFluid(String FluidName) {
		FluidModel = FluidName;
	}
	
	public String getFluidModel() {
		return FluidModel;
	}
}
