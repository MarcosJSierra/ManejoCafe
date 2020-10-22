/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.controller;

import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.kurokami.ManejoCafe.Modelo.ColaOrdenes;
import org.kurokami.ManejoCafe.Modelo.Menu;
import org.kurokami.ManejoCafe.Modelo.Orden;
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
@Slf4j
public class VentasController {
    
    @Autowired
    VentasService ventasService;
    
    @Autowired
    ColaOrdenes colaOrdenes;
    
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
    public String infoMenuVentas(Menu menu, Model model){
        menu = ventasService.menuPorId(menu.getIdMenu());
        model.addAttribute("platillo", menu);
        return "ventas/platillo";
    }
    
    @GetMapping("/ventas/cola-ordenes")
    public String listaColaOrdenes(Model model){
        var lista = colaOrdenes.getListaOrdenes();
        model.addAttribute("lista", lista);
        return "ventas/lista";
    }
    @GetMapping("/ventas/atender-orden")
    public String atenderOrdenes(Model model){
       var lista = colaOrdenes.getListaOrdenes();
        if(lista == null || lista.isEmpty()){
            model.addAttribute("lista", lista);
            return "ventas/lista";
        }
        return "ventas/menu";
    }
}
