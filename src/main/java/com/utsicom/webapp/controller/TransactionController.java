/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.webapp.controller;

import com.utsicom.webapp.dao.DipoDAO;
import com.utsicom.webapp.dao.ItemDAO;
import com.utsicom.webapp.dao.SupplierDAO;
import com.utsicom.webapp.dao.TransactionDAO;
import com.utsicom.webapp.dto.TransactionDTO;
import com.utsicom.webapp.entity.Dipo;
import com.utsicom.webapp.entity.Item;
import com.utsicom.webapp.entity.Supplier;
import com.utsicom.webapp.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author utsi
 */
@Controller
@RequestMapping(value = "/transactions")
public class TransactionController {

    @Autowired
    TransactionDAO transactionDAO;
    @Autowired
    ItemDAO itemDAO;
    @Autowired
    SupplierDAO supplierDAO;
    @Autowired
    DipoDAO dipoDAO;
//    @Autowired
//    ReportDAO reportDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("items", itemDAO.getAll());
        model.addAttribute("suppliers", supplierDAO.getAll());
        model.addAttribute("dipos", dipoDAO.getAll());
        model.addAttribute("transactions", transactionDAO.getAll());
        System.out.println(transactionDAO.getAll());
        return "admin/transactions/index";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(TransactionDTO transactionDTO){
        System.out.println("save bhitra aayooooooooooooooooooooooooooo");
        Transaction transaction=new Transaction();
        transaction.setId(transactionDTO.getId());
        transaction.setSupplier(new Supplier(transactionDTO.getSid()));
        transaction.setDipo(new Dipo(transactionDTO.getDid()));
        transaction.setItem(new Item(transactionDTO.getIid()));
        transaction.setItemReceived(transactionDTO.getItemReceived());
        transaction.setItemRefilled(transactionDTO.getItemRefilled());
        transaction.setItemSold(transactionDTO.getItemSold());
        transaction.setLeakageReceived(transactionDTO.getLeakageReceived());
        transaction.setLeakageReturned(transactionDTO.getRefilledAmount());
        transaction.setReceivedAmount(transactionDTO.getReceivedAmount());
        transaction.setRefilledAmount(transactionDTO.getRefilledAmount());
        System.out.println((transactionDTO.getRefilledAmount()));
//        ModelMapper mapper= new ModelMapper();
//        transaction = mapper.map(transactionDTO, Transaction.class);
        
        if(transactionDTO.getId()>0){
        transactionDAO.update(transaction);
        }else{
            transactionDAO.insert(transaction);
        }
        return "redirect:/transactions";
      
    }
    

    @RequestMapping(value = "/create/{id}", method = RequestMethod.GET)
    public String create(@PathVariable int id, Model model) {

       //model.addAttribute("transactions", transactionDAO.getAll());
       model.addAttribute("suppliers", supplierDAO.getAll());
       model.addAttribute("dipo", dipoDAO.getById(id));
       model.addAttribute("items", itemDAO.getAll());
        return "admin/transactions/create";
    }
    
    
    @RequestMapping(value = "/report/{id}", method = RequestMethod.GET)
    public String transactionDetails(@PathVariable int id, Model model, ModelMap map) {
        
        model.addAttribute("items", itemDAO.getAll());
        model.addAttribute("suppliers", supplierDAO.getAll());
        model.addAttribute("dipo", dipoDAO.getById(id));
        model.addAttribute("transactions", transactionDAO.getAllByDipo(id));
        //transactionDAO.createViewById(id);
        //model.addAttribute("reports", reportDAO.getAll());
        System.out.println(transactionDAO.getAllByDipo(id));
        return "/admin/report/dipoReport";

    }
}
