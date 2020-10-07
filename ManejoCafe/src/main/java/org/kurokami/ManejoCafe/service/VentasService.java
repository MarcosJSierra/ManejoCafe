/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.service;

import java.util.ArrayList;
import org.kurokami.ManejoCafe.Modelo.Menu;

/**
 *
 * @author marcos
 */
public interface VentasService {
    public Menu menuPorId(int id);
    
    public ArrayList<Menu> getTodosLosPlatillos();
}
