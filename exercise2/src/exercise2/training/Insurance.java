package exercise2.training;

public class Insurance {

	
	private int policyNumber;
	private String policyHolderName;
	private int age;
	private double insuredAmount;
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getInsuredAmount() {
		return insuredAmount;
	}
	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	public Insurance(int policyNumber, String policyHolderName, int age, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.age = age;
		this.insuredAmount = insuredAmount;
	}
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double calulatePremium()
	{
		
		if(this.age<25)
		{
			return 0.6;
		}
		else
		{
			return 0.7;
		}
	}
	
}
