package com.cjc.main.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.crud.model.Account;
import com.cjc.main.crud.repository.AccountRepo;
import com.cjc.main.crud.service.AccountService;

@Service
public class AccountSeviceimpl implements AccountService {

	@Autowired
	AccountRepo ar;
	@Override
	public void saveData(Account a) {
		ar.save(a);
		
	}
	@Override
	public Account findByUnameAndPass(String uname, String pass) {
		// TODO Auto-generated method stub
		return ar.findByUnameAndPass(uname, pass);
	}
	@Override
	public Account findByAccno(long accno) {
		// TODO Auto-generated method stub
		return ar.findByAccno(accno);
	}

}
