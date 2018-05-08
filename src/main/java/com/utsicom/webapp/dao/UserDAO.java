/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dao;

import com.utsicom.webapp.entity.User;

/**
 *
 * @author utsi
 */
public interface UserDAO extends GenericDAO<User>{
    User findByUserName(String username);
    
}
