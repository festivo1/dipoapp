/*
 * Copyright 2018 utsi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.utsicom.webapp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author utsi
 */
@Entity
@Table(name = "transactions")
@NamedQueries({
    @NamedQuery(name = "Transaction.findAll", query = "SELECT t FROM Transaction t")})
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "item_received")
    private Integer itemReceived;
    @Column(name = "item_refilled")
    private Integer itemRefilled;
    @Column(name = "item_sold")
    private Integer itemSold;
    @Column(name = "received_amount")
    private Integer receivedAmount;
    @Column(name = "refilled_amount")
    private Integer refilledAmount;
    @Column(name = "leakage_received")
    private Integer leakageReceived;
    @Column(name = "leakage_returned")
    private Integer leakageReturned;
    @Column(name = "added_date", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @JoinColumn(name = "dipo_id", referencedColumnName = "id")
    @ManyToOne
    private Dipo dipo;
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    @ManyToOne
    private Item item;
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    @ManyToOne
    private Supplier supplier;

    public Transaction() {
    }

    public Transaction(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemReceived() {
        return itemReceived;
    }

    public void setItemReceived(Integer itemReceived) {
        this.itemReceived = itemReceived;
    }

    public Integer getItemRefilled() {
        return itemRefilled;
    }

    public void setItemRefilled(Integer itemRefilled) {
        this.itemRefilled = itemRefilled;
    }

    public Integer getItemSold() {
        return itemSold;
    }

    public void setItemSold(Integer itemSold) {
        this.itemSold = itemSold;
    }

    public Integer getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(Integer receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public Integer getRefilledAmount() {
        return refilledAmount;
    }

    public void setRefilledAmount(Integer refilledAmount) {
        this.refilledAmount = refilledAmount;
    }

    public Integer getLeakageReceived() {
        return leakageReceived;
    }

    public void setLeakageReceived(Integer leakageReceived) {
        this.leakageReceived = leakageReceived;
    }

    public Integer getLeakageReturned() {
        return leakageReturned;
    }

    public void setLeakageReturned(Integer leakageReturned) {
        this.leakageReturned = leakageReturned;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Dipo getDipo() {
        return dipo;
    }

    public void setDipo(Dipo dipo) {
        this.dipo = dipo;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    
}
