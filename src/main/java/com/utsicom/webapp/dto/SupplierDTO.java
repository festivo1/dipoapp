/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dto;

import java.util.Date;

/**
 *
 * @author utsi
 */
public class SupplierDTO {
    private int id;
    private String name, contactNumber, panNumber;
    private Date estd;

    public SupplierDTO() {
    }

    public SupplierDTO(int id, String name, String contactNumber, String panNumber, Date estd) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.panNumber = panNumber;
        this.estd = estd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public Date getEstd() {
        return estd;
    }

    public void setEstd(Date estd) {
        this.estd = estd;
    }
    
    
    
}
