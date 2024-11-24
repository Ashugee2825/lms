package com.dao;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class DbConnection {

	static  SessionFactory sf= null;
	
	Session s;
	public DbConnection()
	{
		sf= new Configuration().configure().buildSessionFactory();
		s= sf.openSession();
		
	}
	
	public Session getSession()
	{
		return s;
	}
}
