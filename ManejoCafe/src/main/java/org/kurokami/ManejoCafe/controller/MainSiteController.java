/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.controller;

import java.util.ArrayList;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.kurokami.ManejoCafe.Modelo.Cliente;
import org.kurokami.ManejoCafe.Modelo.Puesto;
import org.kurokami.ManejoCafe.Modelo.Usuario;
import org.kurokami.ManejoCafe.service.MainsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author marcos
 */
@Controller
@Slf4j
public class MainSiteController {
    @Autowired
    private MainsiteService mainsiteService;
    
    @GetMapping("/")
    public String getIndex(@AuthenticationPrincipal User user){
        return "mainsite/index";
    }
    @GetMapping("/cliente/registro")
    public String regsitroCliente(Cliente cliente, Model model){
        model.addAttribute(cliente);
        var rol = mainsiteService.puestoPorId(3);
        cliente.setPuesto(rol);
        log.info(rol.toString());
        model.addAttribute("rol", rol);
        return "mainsite/registroClientes";
    }
    
    @PostMapping("/cliente/registrar")
    public String guardarRegistroCliente(@Valid Cliente cliente, Errors errors, Model model){
        log.info(cliente.toString());
        if(errors.hasErrors()){
            model.addAttribute(cliente);
            var rol = mainsiteService.puestoPorId(3);
            model.addAttribute("rol", rol);
            return "mainsite/registroClientes";
        }
        return "redirect:/";
    }
    
    @GetMapping("/usuario/registro")
    public String registrarUsuario(Usuario usuario, Model model){
        model.addAttribute("usuario", usuario);
        var rol = mainsiteService.listarPuestos();
        model.addAttribute("rol", rol);
        return "mainsite/registroUsuario";
    }
    
    @PostMapping("/usuario/registrar")
    public String guardarRegistroUsuario(Model model, @Valid Usuario usuario, Errors errors){
        if(errors.hasErrors()){
             model.addAttribute("usuario", usuario);
            var rol = mainsiteService.listarPuestos();
            model.addAttribute("rol", rol);
            return "mainsite/registroUsuario";
        }
        log.info(usuario.toString());
        return "redirect:/";
    }
}
