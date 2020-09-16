package exercise2.training;

public class VehicleInsurance extends Insurance{

	
	
	private int vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
	
	
	public VehicleInsurance(int policyNumber, String policyHolderName, int age, double insuredAmount, int vehicleModel,
			int yearOfManufacture, double costOfVehicle) {
		super(policyNumber, policyHolderName, age, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}
	
	
	@Override
	public double calulatePremium() {
		// TODO Auto-generated method stub
		double premium =0.0;
		
		if(vehicleModel == 2 && yearOfManufacture < 2)
		{
			premium = 0.5*costOfVehicle;
		}
		else if(vehicleModel == 2 && yearOfManufacture >= 2)
		{
			premium = 0.6*costOfVehicle;
		}
		else if(vehicleModel == 4 && yearOfManufacture < 2)
		{
			premium = 0.4*costOfVehicle;
		}
		else if(vehicleModel == 4 && yearOfManufacture >= 2)
		{
			premium = 0.5*costOfVehicle;
		}
		
		return premium;
		
		//return super.calulatePremium();
	}



	public int getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public double getCostOfVehicle() {
		return costOfVehicle;
	}

	public void setCostOfVehicle(double costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}


}
