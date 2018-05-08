///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.utsicom.webapp.controller;
//
//import com.utsicom.webapp.dao.DipoDAO;
//import com.utsicom.webapp.entity.Dipo;
//import javax.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// *
// * @author utsi
// */
//@Controller
////@RequestMapping(value = "/login")
//public class LoginController {
//    @Autowired
//     DipoDAO dipoDAO;
//    
//     Dipo dipo;
//    
//    @RequestMapping(value="/login", method = RequestMethod.GET)
//    public String showLoginForm() {
//        //model.addAttribute("dipos", dipoDAO.getAll());
//        return "login/index";
//
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String verifyLogin(@RequestParam String userId,
//            @RequestParam String password, HttpSession session, Model model) {
//        dipo = dipoDAO.loginDipo(userId, password);
//        if(dipo==null){
//            model.addAttribute("loginError", "Error in loggin in. Please try again");
//            return "login/index";
//        }
//        session.setAttribute("loggedInDipo", dipo);
//        return "redirect:/";
////
//    }
//
//}
