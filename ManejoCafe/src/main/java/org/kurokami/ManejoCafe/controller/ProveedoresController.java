package org.kurokami.ManejoCafe.controller;

import lombok.extern.slf4j.Slf4j;
import org.kurokami.ManejoCafe.Modelo.Proveedor;
import org.kurokami.ManejoCafe.service.ProveedoresService;
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
public class ProveedoresController {

    @Autowired
    ProveedoresService proveedoresService;

    @GetMapping("/proveedores/")
    public String mainProveedores(){
        return "proveedores/index";
    }

    @GetMapping("/proveedores/listaproveedores")
    public String listarProveedores(Model model){
        var proveedores = proveedoresService.getProveedores();
        return "proveedores/listaproveedores";
    }

    @GetMapping("/proveedores/listaproveedores/{idProveedor}")
    public String listarId(Proveedor proveedor, Model model){
        proveedor = proveedoresService.proveedorPorId(proveedor.getIdProveedor());
        model.addAttribute("proveedor", proveedor);
        return "proveedores/listarproveedor";
    }
}
