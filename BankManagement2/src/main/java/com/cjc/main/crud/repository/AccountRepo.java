package com.cjc.main.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.crud.model.Account;

public interface AccountRepo extends JpaRepository<Account, Integer> {

	public Account findByUnameAndPass(String uname, String pass);
	public Account findByAccno(long accno);
	
}
