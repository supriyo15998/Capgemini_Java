package day3.account;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private int balance;

	private Policy policies[]; // collections

	public Account(int accountNumber, String accountHolderName, int balance, Policy[] policies) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.policies = policies;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Policy[] getPolicies() {
		return policies;
	}

	public void setPolicies(Policy[] policies) {
		this.policies = policies;
	}

}
