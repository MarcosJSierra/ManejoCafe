package org.kurokami.ManejoCafe.controller;

import lombok.extern.slf4j.Slf4j;
import org.kurokami.ManejoCafe.Modelo.Compra;
import org.kurokami.ManejoCafe.service.ComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author malopez
 */
@Controller
@Slf4j
public class ComprasController {

    @Autowired
    ComprasService comprasService;

    @GetMapping("/compras/")
    public String mainVentas(){
        return "compras/index";
    }

    @GetMapping("/compras/listacompras")
    public String listarCompras(Model model){
        var compras = comprasService.getCompras();
        model.addAttribute("compras", compras);
        return "compras/listacompras";
    }

    @GetMapping("/compras/listacompras/{idCompra}")
    public String listarId(Model model, Compra compra){
        compra = comprasService.compraPorId(compra.getIdCompra());
        model.addAttribute("compra", compra);
        return "compras/listarcompra";
    }
}
