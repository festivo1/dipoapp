/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dao.impl;

//import com.utsicom.webapp.dao.GenericDAO;
import com.utsicom.webapp.dao.UserDAO;
import com.utsicom.webapp.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author utsi
 */
@Repository("userDAO")
public class UserDAOImpl extends GenericDAOImpl<User> implements UserDAO {

    @Override
    public User findByUserName(String username) {
        session = sessionFactory.openSession();
        List<User> users = new ArrayList<User>();
        String sql = "select * from users where username=" + username;
//        Query query = session.createNativeQuery(sql).addEntity(User.class);
//        users= query.list();
        users = session.createQuery("from User wehre username=?")
                .setParameter(0, username).list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }

    }

}
