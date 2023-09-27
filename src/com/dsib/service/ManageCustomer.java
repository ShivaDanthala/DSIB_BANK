package com.dsib.service;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.dsib.bean.Customer;
import com.dsib.util.BankingException;

public class ManageCustomer {

	private	BankingService	bService = new BankingServiceImpl(); 
	public void createCustomer(Scanner scan) {
		try {
			System.out.println("Account creation is happening here..!!!");
			System.out.println();

			System.out.println("Enter Account Number");
			long accountNumber = scan.nextLong();

			System.out.println("Enter Customer Name");
			String customerName=scan.next();

			System.out.println("Enter Mobile Number");
			long mobileNumber=scan.nextLong();

			System.out.println("Enter type of account");
			String accountType = scan.next();

			System.out.println("Enter Branch Name");
			String branchName=scan.next();

			System.out.println("Enter Balance");
			double balance = scan.nextDouble();

			Customer customer = new Customer(accountNumber, customerName, mobileNumber, accountType, branchName, balance);
			boolean success=false;
			success = bService.createAccount(customer);
			if(success) {
				System.out.println("Account created with Account no: " +customer.getAccountNumber());
			}else {
				System.err.println("Failed to create Account");
			}
		}catch (InputMismatchException ime) {
			System.out.println("Please enter approppriate value");
			scan.nextLine();
		}
	}
	public void depositAmount(Scanner scan) {

		System.out.println("2. Deposit Amount");
		try {
			System.out.println("Enter Account number of customer");
			long accountNumber = scan.nextLong();
			System.out.println("Enter Amount");
			double depositAmount =scan.nextDouble();
			Customer customer = bService.depositAmount(accountNumber, depositAmount); 

			if (customer != null) {
				System.out.println("Amount deposited, balance = " + customer.getBalance());
			} else {
				System.out.println("Account number does not exist");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter approppriate value");
			scan.nextLine();
		}
	}
	public void withDrawAmount(Scanner scan) throws BankingException {

		System.out.println("3. Withdraw Amount");

		try {
			System.out.println("Enter Account number of customer");
			long accountNumber = scan.nextLong();
			System.out.println("Enter the amount to withdraw");
			double withDrawAmount= scan.nextDouble();

			Customer customer =bService.withDrawAmount(accountNumber,withDrawAmount);
			if(customer!=null) {
				System.out.println("Amount with drawn for the account " +customer.getAccountNumber()+ "and the remaining balance is : " +customer.getBalance());
			}else {
				System.out.println("Amount number dosent exist");
			}

		}catch(InputMismatchException e) {
			
		}
		
	}
	public void exitApplication(Scanner scanner) {
		System.out.println("Exiting the application. Bye.. Have a Good Day!!");
		System.exit(0);
	}





}
