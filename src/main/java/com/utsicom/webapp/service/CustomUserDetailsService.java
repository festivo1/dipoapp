/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.service;

import com.utsicom.webapp.dao.UserDAO;
import com.utsicom.webapp.entity.User;
import com.utsicom.webapp.service.CustomUserDetail;
//import com.utsicom.webapp.entity.User;
import com.utsicom.webapp.entity.UserRole;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author utsi
 */
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
        // returns the get(0) of the user list obtained from the db
        com.utsicom.webapp.entity.User domainUser = userDAO.findByUserName(username);

      List<GrantedAuthority> authorities = 
                                      buildUserAuthority( domainUser.getUserRole());
        System.out.println("Username has been loaded");
		return  (UserDetails) buildUserForAuthentication(domainUser, authorities);
		
	}

	// Converts com.utsicom.webapp.entity.User user to
	// org.springframework.security.core.userdetails.User
	private com.utsicom.webapp.entity.User buildUserForAuthentication(com.utsicom.webapp.entity.User user, 
		List<GrantedAuthority> authorities) {
		return new com.utsicom.webapp.entity.User(user.getId(), user.getPassword(), user.getUsername(), authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
		for (UserRole userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}

		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
	}

}