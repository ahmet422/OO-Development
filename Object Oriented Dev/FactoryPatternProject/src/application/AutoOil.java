package application;

public abstract class AutoOil {
	
	protected String oilModel;
	
	public AutoOil(String oilName) {
		oilModel = oilName;
	}
	
	public String getOilModel() {
		return oilModel;
	}

}
