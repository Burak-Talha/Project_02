package com.example.project_2.dataAccess.concretes;

import com.example.project_2.dataAccess.abstracts.SubjectDal;
import com.example.project_2.entities.concretes.Subject;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public class HibernateSubjectDal implements SubjectDal {

    private final EntityManager entityManager;

    @Autowired
    public HibernateSubjectDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Subject> getAllSubject() {
        Session session = entityManager.unwrap(Session.class);
        String query = "from com.example.project_2.entities.concretes.Subject";
        List<Subject> subjects = session.createQuery(query, Subject.class).list();
        return subjects;
    }

    @Override
    @Transactional
    public Subject getSubjectById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Subject subject = session.get(Subject.class, id);
        return subject;
    }

    @Override
    @Transactional
    public List<Subject> getByName(String name){
        Session session = entityManager.unwrap(Session.class);
        List<Subject> subjects = session.createQuery("from Subject WHERE subject_name like '"+'%'+name+'%'+"' ").list();
        return subjects;
    }

    @Override
    @Transactional
    public void create(Subject subject) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(subject);
    }

    @Override
    @Transactional
    public void update(Subject subject) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(subject);
    }

    @Override
    @Transactional
    public void delete(Subject subject) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(subject);
    }

}
