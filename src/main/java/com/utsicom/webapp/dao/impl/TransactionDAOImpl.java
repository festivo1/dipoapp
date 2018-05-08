/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dao.impl;

import com.utsicom.webapp.dao.TransactionDAO;
import com.utsicom.webapp.entity.Transaction;
import java.util.List;
import org.hibernate.query.Query;

//import javax.persistence.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author utsi
 */
@Repository(value = "TransactionDAO")
public class TransactionDAOImpl extends GenericDAOImpl<Transaction> implements TransactionDAO {

    // @Autowired(required = true)
    // protected SessionFactory sessionFactory;
    // Session session;
//    @Override
//    public List<Transaction> getAllByDipo(int id) {
//        session = sessionFactory.openSession();
//        //org.hibernate.Transaction tx = null;
////        String sql = " select  t.added_date "
////                + " as added_date, s.name as supplier_name, d.name as dipo_name, "
////                + "i.name as item_name, i.price as price, t.item_received as "
////                + "item_received, t.item_refilled as item_refilled, t.item_sold"
////                + " as item_sold, t.received_amount as received_amount, "
////                + "t.refilled_amount as refilled_amount, t.leakage_received "
////                + "as leakage_received, t.leakage_returned "
////                + "as leakage_returned from transactions t join suppliers"
////                + " s on s.id= t.supplier_id join dipos d on d.id= t.dipo_id "
////                + "join items i on i.id= t.item_id where d.name=:dipo";
//        String sql = "select * from transactions t  where t.dipo_id=" + id;
//        //String sql = "select t.id, d.name from Transaction t join dipos d on d.id=t.dipo_id where d.id=:id";
////        Query query = session.createNativeQuery(sql);
////        query.setParameter("dipo", dipoName);
////        //tx.commit();    
//        Query query = session.createNativeQuery(sql).addEntity(Transaction.class);
//        List<Transaction> list = query.list();
//        //System.out.println(list);
//        //List<Transaction> transactions = session.createNativeQuery(sql).setParameter("id", id).list();
//        //System.out.println(transactions);
//        return list;
//
//    }

    @Override
    public List<Transaction> getAllByDipo(int id) {
        session = sessionFactory.openSession();
        String sql = "select * from transactions t  join dipos d on t.dipo_id=d.id where d.id=" + id;
        Query query = session.createNativeQuery(sql).addEntity(Transaction.class);
        List<Transaction> list = query.list();

        return list;
    }

   

}
