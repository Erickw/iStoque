package com.erick.istoque;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory session = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
			
		} catch (Throwable e) {
			System.out.println("deu ruim");
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSession() {
		return (SessionFactory) session;
	}
}
