package day3;

public class BankCustomer {

	private int accountNumber;
	private String customerName;
	private String userName;
	private String password;
	private int balance;
	private boolean isKycCompleted;
	private boolean isLoggedIn;

	public void logIn(String username, String password) {
		if (this.userName.equals(username) && this.password.equals(password)) {
			this.isLoggedIn = true;
		} else {
			this.isLoggedIn = false;
		}
	}

	public int getBalance() {
		if (this.isLoggedIn)
			return this.balance;
		else
			return 401;
	}

	public void deposit(int depositAmount) {
		this.balance += depositAmount;
	}

	public void withdraw(int withdrawAmount) {
		if (withdrawAmount < this.balance) {
			this.balance -= withdrawAmount;
		}
	}

	public void completeKyc() {
		if (!this.isLoggedIn) {
			System.out.println("401");
		} else {
			if (!this.isKycCompleted) {
				this.isKycCompleted = true;
				System.out.println("KYC Completed");
			} else {
				System.out.println("KYC already done");
			}
		}
	}

	public static void main(String[] args) {
		BankCustomer b = new BankCustomer();
	}

}
