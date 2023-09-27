package com.dsib.bean;

public class Customer {

	private long accountNumber;
	private String customerName;
	private long mobileNumber;
	private String branchName;
	private double balance;
	private String accountType;

	public Customer() {
	}

	public Customer(long accountNumber, String customerName, long mobileNumber, String accountType,
			String branchName, double balance) {

		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.mobileNumber=mobileNumber;
		this.branchName=branchName;
		this.balance=balance;
		this.accountType=accountType;

	}

	@Override
	public String toString() {
		return "Customer [accountNumber=" + accountNumber + ","
				+ "customerName=" + customerName + ","
				+ "mobileNumber="+ mobileNumber + ","
				+ " branchName=" + branchName + ", "
				+ "balance=" + balance + ", "
				+ "accountType=" + accountType+ "]" 

				+ "....YES!!!... Customer created";
	}


	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}
