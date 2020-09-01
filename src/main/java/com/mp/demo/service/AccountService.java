package com.mp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.demo.entity.Account;
import com.mp.demo.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public void addAccountDetails(Account account)
	{
		 accountRepository.save(account);
	}
	
}
