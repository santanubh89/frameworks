package com.app.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static Session getSession() {
		Configuration configuration = new Configuration().configure("hibernate.config.xml");
		configuration.setInterceptor(new MyInterceptor());
		SessionFactory sf = configuration.buildSessionFactory();
		return sf.openSession();
	}

}
