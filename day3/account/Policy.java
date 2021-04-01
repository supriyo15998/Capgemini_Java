package day3.account;

public class Policy {
	private int policyId;
	private String policyName;
	private int policyAmount;

	public Policy(int policyId, String policyName, int policyAmount) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyAmount = policyAmount;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public int getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}

	public void showDetails() {

		System.out.println("Policy Id: " + this.getPolicyId());
		System.out.println("Policy Name: " + this.getPolicyName());
		System.out.println("Policy Amount: " + this.getPolicyAmount());
		System.out.println("-----------------------------------");

	}

}
