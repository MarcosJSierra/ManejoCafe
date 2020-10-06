/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.controller;

import org.kurokami.ManejoCafe.Modelo.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author marcos
 */
@Controller
public class VentasController {
    
    @GetMapping("/ventas/")
    public String mainVentas(){
        return "/ventas/index";
    }
    
    @GetMapping("/ventas/menu")
    public String menuVentas(){
        return "/ventas/menu";
    }
    
    @GetMapping("/ventas/menu/{idMenu}")
    public String infoMenuVentas(Menu menu){
        return "/ventas/platillo";
    }
}
