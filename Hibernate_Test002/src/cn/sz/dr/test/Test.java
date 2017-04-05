package cn.sz.dr.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.sz.dr.pojo.News;

public class Test {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration().configure();
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction ts=null;
		Object obj=null;
		
		try {
			ts=session.getTransaction();
			
			obj=session.get(News.class, 10);
					
			
			
			ts.commit();
		} catch (Exception e) {
			 e.printStackTrace();
			 ts.rollback();
		}finally{
			session.close();
		}
		
	}
	
	
}
