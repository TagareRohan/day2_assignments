package exercise2.training;

public class Application {

	
	public static void main(String[] args)
	{
		Insurance insureObj=new Insurance(3534,"James",34,2500.0);
		System.out.println(insureObj.calulatePremium());
	}
	
}
