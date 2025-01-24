package com.cjc.main.crud.service;

import org.springframework.stereotype.Service;

import com.cjc.main.crud.model.Account;


public interface AccountService  {

	public void saveData(Account a);
	
	public Account findByUnameAndPass(String uname, String pass);
	
	public Account findByAccno(long accno);
}
