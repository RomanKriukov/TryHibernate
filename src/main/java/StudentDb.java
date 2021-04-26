import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDb {

    public StudentDb(){

    }

    public void addStudent(Student student){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

    public void deleteStudent(Student student){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
        session.close();
    }

    public Student findStudent(int id){
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    public List<Student> showAllStudents(){
        return (List<Student>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from Student").list();
    }
}
