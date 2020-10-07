/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.controller;

import org.kurokami.ManejoCafe.Modelo.Menu;
import org.kurokami.ManejoCafe.service.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author marcos
 */
@Controller
public class VentasController {
    
    @Autowired
    VentasService ventasService;
    
    @GetMapping("/ventas/")
    public String mainVentas(){
        return "ventas/index";
    }
    
    @GetMapping("/ventas/menu")
    public String menuVentas(Model model){
        var platillos = ventasService.getTodosLosPlatillos();
        model.addAttribute("platillos", platillos);
        return "ventas/menu";
    }
    
    @GetMapping("/ventas/menu/{idMenu}")
    public String infoMenuVentas(Menu menu){
        return "/ventas/platillo";
    }
}
