//
//package com.utsicom.webapp.service;
//
//import com.utsicom.webapp.dao.UserDAO;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import com.utsicom.webapp.entity.User;
//import com.utsicom.webapp.entity.UserRole;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
////@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Qualifier("userDAO")
//    @Autowired
//    private UserDAO userDAO;
//
//    public MyUserDetailsService() {
//    }
//
//    public MyUserDetailsService(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = (User) userDAO.findByUserName(username);
//        List<GrantedAuthority> authorities = buildUserAuthority((Set<UserRole>) user.getUserRoleList());
//        return (UserDetails) buildUserForAuthentication(user, authorities);
//
//    }
//
//    private User buildUserForAuthentication(User user,
//            List<GrantedAuthority> authorities) {
//        System.out.println("called buildUserForAuthentication(Users user, List<GrantedAuthority> authorities) method....");
//        return new User(user.getId(), user.getUsername(),
//                user.getPassword(), user.getEnabled(), Arrays.asList(authorities));
//    }
//
//    private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {
//
//        Set<GrantedAuthority> setAuths = new HashSet<>();
//
//        // Build user's authorities
//        userRoles.forEach((userRole) -> {
//            setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
//        });
//
//        List<GrantedAuthority> Result = new ArrayList<>(setAuths);
//
//        return Result;
//    }
//}
