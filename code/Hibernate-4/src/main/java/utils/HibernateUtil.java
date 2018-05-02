package utils;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
    }


    public static void addOrUpdate(Object o){
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.saveOrUpdate(o);
        session.getTransaction().commit();
        session.close();
    }

    public static Object getById(Class entity, int id){
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Object obj = session.get(entity, id);
        session.getTransaction().commit();
        session.close();

        return obj;
    }

    public static Object getByField(Class entity, String field, String value){
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        Criteria criteria = session.createCriteria(entity);
        Object obj = criteria.add(Restrictions.eq(field, value))
                .uniqueResult();
        session.getTransaction().commit();
        session.close();

        return obj;
    }


    public static void deleteByObject(Object o){
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
    }

    public static void deleteById(Class entityName, int id){
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.delete(getById(entityName, id));
        session.getTransaction().commit();
        session.close();
    }
}
