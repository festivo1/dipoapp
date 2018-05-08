/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.dto;

/**
 *
 * @author utsi
 */
public class TransactionDTO {
    private int id, did, sid, iid;
    private int itemReceived, itemRefilled, itemSold, receivedAmount, 
            refilledAmount, leakageReceived, leakageRefilled;

    public TransactionDTO() {
    }

    public TransactionDTO(int id, int did, int sid, int iid, int itemReceived, int itemRefilled, int itemSold, int receivedAmount, int refilledAmount, int leakageReceived, int leakageRefilled) {
        this.id = id;
        this.did = did;
        this.sid = sid;
        this.iid = iid;
        this.itemReceived = itemReceived;
        this.itemRefilled = itemRefilled;
        this.itemSold = itemSold;
        this.receivedAmount = receivedAmount;
        this.refilledAmount = refilledAmount;
        this.leakageReceived = leakageReceived;
        this.leakageRefilled = leakageRefilled;
    }

    public int getItemReceived() {
        return itemReceived;
    }

    public void setItemReceived(int itemReceived) {
        this.itemReceived = itemReceived;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getItemRefilled() {
        return itemRefilled;
    }

    public void setItemRefilled(int itemRefilled) {
        this.itemRefilled = itemRefilled;
    }

    public int getItemSold() {
        return itemSold;
    }

    public void setItemSold(int itemSold) {
        this.itemSold = itemSold;
    }

    public int getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(int receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public int getRefilledAmount() {
        return refilledAmount;
    }

    public void setRefilledAmount(int refilledAmount) {
        this.refilledAmount = refilledAmount;
    }

    public int getLeakageReceived() {
        return leakageReceived;
    }

    public void setLeakageReceived(int leakageReceived) {
        this.leakageReceived = leakageReceived;
    }

    public int getLeakageRefilled() {
        return leakageRefilled;
    }

    public void setLeakageRefilled(int leakageRefilled) {
        this.leakageRefilled = leakageRefilled;
    }
    
    
}
