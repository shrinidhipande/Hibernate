package com.hme.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hme.entities.Account;

public class AccountDAO {

	public static Account getAccount(int accountNo) {
		Account account = null;
		
		Configuration configuration = new Configuration().configure();
		SessionFactory sesionFactory = configuration.buildSessionFactory();
		Session session = sesionFactory.openSession();
		
		account = session.get(Account.class,accountNo);
		
		return account;
		
	}
	
}
