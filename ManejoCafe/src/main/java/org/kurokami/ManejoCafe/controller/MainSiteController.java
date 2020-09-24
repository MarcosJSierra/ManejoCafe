/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.controller;

import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.kurokami.ManejoCafe.Modelo.Cliente;
import org.kurokami.ManejoCafe.Modelo.Puesto;
import org.kurokami.ManejoCafe.Modelo.Usuario;
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
@Slf4j
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
    
    @GetMapping("/usuario/registro")
    public String registrarUsuario(Usuario usuario, Model model){
        model.addAttribute("usuario", usuario);
        var rol = new Puesto();
        model.addAttribute("rol", rol);
        return "mainsite/registroUsuario";
    }
    
    @PostMapping("/usuario/registrar")
    public String guardarRegistroUsuario(Cliente cliente, Puesto rol){
        log.info(cliente.toString());
        log.info(rol.toString());
        return "redirect:/";
    }
}
