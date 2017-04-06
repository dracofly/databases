package cn.sz.kjy.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.sz.kjy.pojo.News;

public class test {

	public static void main(String[] args) {
		
		//1.����configuration���󣬲�����hibernate�����ļ���ʵ��ӳ���ļ�
		Configuration conf = new Configuration().configure();
		
		//2.����configuration���󣬴������ݿ����ӹ���
		SessionFactory factory= conf.buildSessionFactory();
		
		//3.�����������Ӷ���
		Session session=factory.openSession();
	
		//4.��ȡ�������
		Transaction ts=null;
		
		try {
			ts=session.beginTransaction();
		
		
			//5.����־û�����
/*			News news = new News();	
			news.setNtid(555600);
			session.save(news);*/
			
			//�޸�
			/*News news = new News();	
			news.setNtid(555);
			news.setNid(13);
			session.update(news);*/
			
			//��ѯ
			/*Object object = session.get(News.class, 12);
			News news = (News) object;
			System.out.println(news.getNtid()+news.getNauthor()+news.getNcontent());*/
			
			//ɾ��
			News news = new News();
			news.setNid(13);
			
			session.delete(news);
			
			
			//6.�����ύ
			ts.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//6.����ع�
			ts.rollback();
		}finally{
			//7.�ر�����
		
			session.close();
		}
		
	}
	
}
