package com.hme.test;

import com.hme.dao.AccountDAO;
import com.hme.entities.Account;

public class Test {

	public static void main(String[] args) {
		
		Account account = null;
		account = AccountDAO.getAccount(11);
		System.out.println(account);
	}

}
