package com.dsib.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.dsib.service.ManageCustomer;
import com.dsib.util.BankingException;

public class BankingDSIB_Main {

	public BankingDSIB_Main() throws BankingException {
		System.out.println("-----Intiated DSIB Banking------");

		ManageCustomer manageCustomer= new ManageCustomer();
		Scanner scan = new Scanner(System.in);
		int choice=0;

		while(true) {
			choice=getChoice(scan);
			switch(choice) {
			case 1:
				manageCustomer.createCustomer(scan);
				break;

			case 2:
				manageCustomer.depositAmount(scan);
				break;

			case 3:
				manageCustomer.withDrawAmount(scan);
				break;

			case 9:
				manageCustomer.exitApplication(scan);
			}
		}
	} // End of Constructor




	private int getChoice(Scanner scan) {
		int choice=0;

		System.out.println("_________________________");
		System.out.println("1. Create a new account");
		System.out.println("2. Deposit amount");
		System.out.println("3. WithDraw amount");
		System.out.println("9. Exit Application");
		System.out.println("Enter your choice");

		try {
			choice=scan.nextInt();
		}catch (InputMismatchException ime) {
			System.out.println("Enter Number only");
			scan.nextLine();
		}

		return choice;

	}

	public static void main(String[] args) throws BankingException {
		new BankingDSIB_Main();
	}

}
