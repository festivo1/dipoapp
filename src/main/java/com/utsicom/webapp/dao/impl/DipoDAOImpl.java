/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dao.impl;

import com.utsicom.webapp.dao.DipoDAO;
import com.utsicom.webapp.entity.Dipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "DipoDAO")
class DipoDAOImpl extends GenericDAOImpl<Dipo> implements DipoDAO {

//    public Dipo loginDipo(String userId, String password) {
//        return null;
//
//    }
////    @Autowired
//    Dipo dipo;
//
//    public Dipo loginDipo(String userId, String password) {
//        session = sessionFactory.openSession();
//      dipo = session.get(Dipo.class, userId);
//        if (dipo != null && dipo.getContactNumber().equalsIgnoreCase(password)) {
//            return dipo;
//        }
//        return null;

    //   }
}
