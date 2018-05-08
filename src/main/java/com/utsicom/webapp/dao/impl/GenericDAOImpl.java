/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dao.impl;


import com.utsicom.webapp.dao.GenericDAO;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author utsi s
 * @param <T>
 */

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

    @Autowired(required = true)
    protected SessionFactory sessionFactory;
    protected Class<T> persistClass;
    protected Session session;
    protected Transaction transaction;

    public GenericDAOImpl() {
        persistClass = (Class<T>) ((ParameterizedType) getClass().
                getGenericSuperclass()).getActualTypeArguments()[0];

    }

    @Override
    public List<T> getAll() {
        session = sessionFactory.openSession();

        return session.createCriteria(persistClass).list();

    }
    
        

    
    @Override
    public void insert(T t) {
        session = (Session) sessionFactory.openSession();
        transaction = session.beginTransaction();
        session.save(t);
        transaction.commit();
    }

    @Override
    public boolean delete(int id) {
          persistClass = (Class<T>) getById(id);
        if (persistClass == null) {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(persistClass);
            transaction.commit();
            return true;
        }

        return false;
       
        
    }

    @Override
     public void update(T t) {
        session = (Session) sessionFactory.openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate( t);
        transaction.commit();
         

    }
     
    @Override
    public T getById(int id) {
         session = sessionFactory.openSession();

        return  (T) session.get(persistClass, id);

    }
    @Override
    public T getByName(String name){
         session = sessionFactory.openSession();

        return  (T) session.get(persistClass, name);
        
    }

  
  }
