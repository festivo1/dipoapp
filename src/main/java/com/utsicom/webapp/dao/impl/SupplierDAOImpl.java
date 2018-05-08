/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dao.impl;

import com.utsicom.webapp.dao.SupplierDAO;
import com.utsicom.webapp.entity.Supplier;
import org.springframework.stereotype.Repository;

/**
 *
 * @author utsi
 */
@Repository(value = "SupplierDAO")
public class SupplierDAOImpl extends GenericDAOImpl<Supplier> implements SupplierDAO{
    
}
