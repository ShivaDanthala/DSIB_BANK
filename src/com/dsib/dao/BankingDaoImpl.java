package com.dsib.dao;

import java.util.HashMap;
import java.util.Map;

import com.dsib.bean.Customer;
import com.dsib.util.BankingException;
import com.dsib.util.Messages;

public class BankingDaoImpl implements BankingDao {

	private Map<Long, Customer> accMap= new HashMap<>();
	private static final double MIN_BALANCE =2000;

	@Override
	public boolean createAccount(Customer customer) {
		System.out.println(customer);
		Customer temp=accMap.get(customer.getAccountNumber());
		if(temp==null) {
			accMap.put(customer.getAccountNumber(), customer);
			return true;
		}

		return false;
	}

	@Override
	public Customer depositAmount(long accountNumber, double depositAmount) {

		Customer customer =accMap.get(accountNumber);
		if(customer!=null) {
			double balance =customer.getBalance();
			balance+=depositAmount;
			customer.setBalance(balance);
			System.out.println(customer.getBalance());
			return customer;
		}
		return null;
	}

	@Override
	public Customer withDrawAmount(long accountNumber, double withDrawAmount) throws BankingException {
		Customer customer =accMap.get(accountNumber);
		if(customer!=null) {
			double balance =customer.getBalance();
			double temp=balance-withDrawAmount;
			if(temp>=MIN_BALANCE ) {
				balance=temp;
				customer.setBalance(balance);
				return customer;
			}else {
				throw new BankingException(Messages.INSUFFICIENT_BALANCE);
			}

		}
		return null;
	}

}
