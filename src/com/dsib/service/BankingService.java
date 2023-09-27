package com.dsib.service;

import com.dsib.bean.Customer;
import com.dsib.util.BankingException;

public interface BankingService {
	
	boolean createAccount(Customer customer);

	Customer depositAmount(long accountNumber, double depositAmount);

	Customer withDrawAmount(long accountNumber, double withDrawAmount) throws BankingException;

}
