package com.capg.pecunia.passbook.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.pecunia.passbook.model.AccountDetails;
import com.capg.pecunia.passbook.repo.IAccountDetailsRepo;

public class AccountService implements IAccountService{
	@Autowired
	IAccountDetailsRepo repo;

	@Override
	public AccountDetails addAccount(AccountDetails account) {
		
		return repo.save(account);
	}

}
