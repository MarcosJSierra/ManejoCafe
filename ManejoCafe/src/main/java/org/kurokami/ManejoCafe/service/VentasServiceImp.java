/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.service;

import java.util.ArrayList;
import org.kurokami.ManejoCafe.Modelo.Menu;
import org.kurokami.ManejoCafe.dao.MenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author marcos
 */
@Service
public class VentasServiceImp implements VentasService{
    
    @Autowired
    MenuDao menuDao;
    
    @Override
    public Menu menuPorId(Integer id) {
        return (Menu) menuDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Menu> getTodosLosPlatillos() {
        return (ArrayList<Menu>) menuDao.findAll();
    }
    
}
