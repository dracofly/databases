package cn.sz.kjy.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.sz.kjy.pojo.News;

public class test {

	public static void main(String[] args) {
		
		//1.创建configuration对象，并解析hibernate配置文件和实体映射文件
		Configuration conf = new Configuration().configure();
		
		//2.根据configuration对象，创建数据库连接工厂
		SessionFactory factory= conf.buildSessionFactory();
		
		//3.工厂生产连接对象
		Session session=factory.openSession();
	
		//4.获取事物对象
		Transaction ts=null;
		
		try {
			ts=session.beginTransaction();
		
		
			//5.事物持久化操作
/*			News news = new News();	
			news.setNtid(555600);
			session.save(news);*/
			
			//修改
			/*News news = new News();	
			news.setNtid(555);
			news.setNid(13);
			session.update(news);*/
			
			//查询
			/*Object object = session.get(News.class, 12);
			News news = (News) object;
			System.out.println(news.getNtid()+news.getNauthor()+news.getNcontent());*/
			
			//删除
			News news = new News();
			news.setNid(13);
			
			session.delete(news);
			
			
			//6.事物提交
			ts.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//6.事物回滚
			ts.rollback();
		}finally{
			//7.关闭连接
		
			session.close();
		}
		
	}
	
}
