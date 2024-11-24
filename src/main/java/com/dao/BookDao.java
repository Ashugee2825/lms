package com.dao;
import com.entity.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class BookDao {

	Session s;
	Transaction t;
	public BookDao()
	{
		DbConnection x= new DbConnection();
		s= x.getSession();
		t=s.beginTransaction();
	}
	public void addBookData(Book b)
	{
		s.save(b);
		t.commit();
		
	}
	public void deleteBookData(Book b)
	{
		s.delete(b);
		t.commit();
		
	}
	
	public Book viewParticularBook(int isbn)
	{
		
		Book m= s.get(Book.class, isbn);
		
        return m;
     }
	
}
