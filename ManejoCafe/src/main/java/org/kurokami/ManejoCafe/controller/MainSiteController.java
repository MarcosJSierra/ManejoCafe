/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.controller;

import org.kurokami.ManejoCafe.Modelo.Cliente;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author marcos
 */
@Controller
public class MainSiteController {
    
    @GetMapping("/")
    public String getIndex(@AuthenticationPrincipal User user){
        return "mainsite/index";
    }
    @GetMapping("/cliente/registro")
    public String regsitroCliente(Cliente cliente, Model model){
        model.addAttribute(cliente);
        return "mainsite/registroClientes";
    }
    
    @PostMapping("/cliente/registrar")
    public String guardarRegistroCliente(Cliente cliente){
        return "redirect:/";
    }
    
}
