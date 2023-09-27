package com.dsib.service;

import com.dsib.bean.Customer;
import com.dsib.dao.BankingDao;
import com.dsib.dao.BankingDaoImpl;
import com.dsib.util.BankingException;

public class BankingServiceImpl implements BankingService {

	private	BankingDao bDao;
	public BankingServiceImpl() {
		bDao = new BankingDaoImpl();
	}

	public boolean createAccount(Customer customer) {

		return bDao.createAccount(customer);

	}

	@Override
	public Customer depositAmount(long accountNumber, double depositAmount) {
		
		return bDao.depositAmount(accountNumber,depositAmount);
	}

	@Override
	public Customer withDrawAmount(long accountNumber, double withDrawAmount) throws BankingException {
		return bDao.withDrawAmount(accountNumber, withDrawAmount);
	}


}
