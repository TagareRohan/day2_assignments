package exercise2.training;

public class Application {

	
	public static void main(String[] args)
	{
		Insurance insureObj=new Insurance(3534,"James",34,2500.0);
		
		System.out.println(insureObj.calulatePremium());
		
		VehicleInsurance vehIns=new VehicleInsurance(3444,"Robert",23,4500.0,2,3,25000.0);
	
		System.out.println(vehIns.calulatePremium());
	}
	
}
