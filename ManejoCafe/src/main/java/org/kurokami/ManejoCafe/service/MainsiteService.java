/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.service;

import java.util.List;
import org.kurokami.ManejoCafe.Modelo.Puesto;
import org.springframework.stereotype.Service;

/**
 *
 * @author marcos
 */
public interface MainsiteService {
    public List<Puesto> listarPuestos();
}