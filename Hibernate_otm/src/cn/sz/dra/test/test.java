package cn.sz.dra.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.sz.dra.pojo.NewsDept;

public class test {

	public static void main(String[] args) {
		
		
		Configuration conf = new Configuration().configure();
		SessionFactory factory=null;
		Session session=null;
		Transaction ts=null;
		
		try {
			factory=conf.buildSessionFactory();
			session=factory.openSession();
			ts=session.beginTransaction();
			
			session.get(NewsDept.class, 1);
			
			
			
			ts.commit();
		} catch (HibernateException e) { 
			e.printStackTrace();
			ts.rollback();
		}finally{
			
			
			
		}
		
		
		
	}
	
}
