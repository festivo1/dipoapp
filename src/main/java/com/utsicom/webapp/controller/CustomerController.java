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
import com.utsicom.webapp.dao.UserDAO;
import com.utsicom.webapp.entity.User;
import com.utsicom.webapp.service.CustomUserDetail;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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
@RequestMapping(value = "/customer")

public class CustomerController {

    @Autowired
    TransactionDAO transactionDAO;
    @Autowired
    ItemDAO itemDAO;
    @Autowired
    SupplierDAO supplierDAO;
    @Autowired
    DipoDAO dipoDAO;
    @Autowired
    UserDAO userDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(String username, Model model) {
//        Authentication auth= SecurityContextHolder.getContext().getAuthentication();
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof UserDetails)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			System.out.println(userDetail);

			model.addAttribute("username", userDetail.getUsername());
                        System.out.println("username k ho??"+userDetail);
		}
        
             
        
        //int id = user.getId();
        //System.out.println("my user id is "+id);
        model.addAttribute("userId", 3);
        return "admin/customers/index";
    }

    @RequestMapping(value = "report/{id}", method = RequestMethod.GET)
    public String transactionDetails(@PathVariable int id, Model model, ModelMap map) {

        model.addAttribute("items", itemDAO.getAll());
        model.addAttribute("suppliers", supplierDAO.getAll());
        model.addAttribute("dipo", dipoDAO.getById(id));
        model.addAttribute("transactions", transactionDAO.getAllByDipo(id));
        //transactionDAO.createViewById(id);
        //model.addAttribute("reports", reportDAO.getAll());
        System.out.println(transactionDAO.getAllByDipo(id));
        return "/admin/customers/transaction_details";

    }
}
