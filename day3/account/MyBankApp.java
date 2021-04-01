package day3.account;

import java.util.*;

public class MyBankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Create accounts
		System.out.println("Enter no. of policies you want to create:");
		int n = sc.nextInt();
		Policy[] policies = new Policy[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Policy Id");
			int policyId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Policy Name");
			String policyName = sc.nextLine();
			System.out.println("Enter Policy Amount");
			int policyAmount = sc.nextInt();
			policies[i] = new Policy(policyId, policyName, policyAmount);
		}
		System.out.println("Enter Account Number");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Account Holder Name");
		String holderName = sc.nextLine();
		System.out.println("Enter Account Balance");
		int accountBalance = sc.nextInt();

		Account a1 = new Account(accountNumber, holderName, accountBalance, policies);
		// Display Information
		printAccountDetails(a1);
		// Display Information Related to Policies
		System.out.println("===Policies Related to Account " + a1.getAccountNumber() + " =====");
		for (Policy policy : a1.getPolicies()) {
			printPolicyDetails(policy);
		}
		// get the policy by Id for specific account
		System.out.println("Enter the Amount for which the Policy Id is required");
		int searchAmount = sc.nextInt();
		sc.close();
		boolean flag = false;
		for (Policy policy : a1.getPolicies()) {

			if (policy.getPolicyAmount() == searchAmount) {
				System.out.println("Policy Found with Amount: " + searchAmount);
				printPolicyDetails(policy);
				flag = true;

			}

		}
		if (!flag)
			System.out.println("No Policy Found with Amount: " + searchAmount);

	}

	private static void printPolicyDetails(Policy policy) {
		System.out.println("Policy Id: " + policy.getPolicyId());
		System.out.println("Policy Name: " + policy.getPolicyName());
		System.out.println("Policy Amount: " + policy.getPolicyAmount());
		System.out.println("-----------------------------------");
	}

	private static void printAccountDetails(Account account) {
		System.out.println("===The Account Details are===");
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Holder Name: " + account.getAccountHolderName());
		System.out.println("Account Balance: " + account.getBalance());
	}

}
