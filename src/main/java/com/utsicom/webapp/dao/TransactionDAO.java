/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dao;

import com.utsicom.webapp.entity.Transaction;
import java.util.List;

/**
 *
 * @author utsi
 */
public interface TransactionDAO extends GenericDAO<Transaction>{
    List<Transaction> getAllByDipo(int id);
    // List<Transaction> getAllByDipo(String username);
}
