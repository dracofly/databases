package cn.sz.kjy.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test22222 {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		
		SessionFactory factory=conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction ts=null;
		
		try {
			ts=session.beginTransaction();
			
			
			
			ts.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			ts.rollback();
		}finally{
			
			
			
			session.close();
		}
		
	}
	
	
}
