package cn.sz.dra.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.sz.dra.pojo.News;

public class test {

	public static void main(String[] args) {
		
		Configuration conf=new Configuration().configure();
		SessionFactory factory =null;
		Session session=null;
		Transaction ts = null;
		News news=null;
		
		try {
			factory=conf.buildSessionFactory();
			session = factory.openSession();
			ts=session.getTransaction();
		
			news=(News) session.get(News.class,9);
			
			System.out.println(news.getNid()+","+news.getNtid()+","+news.getUpwd());
			
			ts.commit();
		} catch (HibernateException e) { 
			e.printStackTrace();
			ts.rollback();
		}finally{
			
			session.close();
		} 
	} 
}
