package com.dsib.dao;

import com.dsib.bean.Customer;
import com.dsib.util.BankingException;

public interface BankingDao {

	boolean createAccount(Customer customer);

	Customer depositAmount(long accountNumber, double depositAmount);

	Customer withDrawAmount(long accountNumber, double withDrawAmount) throws BankingException;
	
}
