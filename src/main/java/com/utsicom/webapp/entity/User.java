/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.entity;

/**
 *
 * @author utsi
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.security.core.GrantedAuthority;/**
 *
 * @author utsi
 */
@Entity
@Table(name = "users")
public class User {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enabled")
    private boolean enabled;
     @OneToMany(mappedBy = "user")
    private Set<UserRole> userRole = new HashSet<UserRole>(0);
    
    @OneToMany(mappedBy = "user")
    private List<Dipo> dipoList;

    public User(Integer id, String password, String username, List<GrantedAuthority> authorities) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }

    public List<Dipo> getDipoList() {
        return dipoList;
    }

    public void setDipoList(List<Dipo> dipoList) {
        this.dipoList = dipoList;
    }

    public User() {
    }

    public User(Integer id, String username, String password, boolean enabled, List<Dipo> dipoList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.dipoList = dipoList;
    }

   
    public User(Integer id, boolean enabled, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        
    }

   


}
