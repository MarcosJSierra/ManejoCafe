/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.dao;

import org.kurokami.ManejoCafe.Modelo.Puesto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author marcos
 */
public interface PuestoDao  extends CrudRepository<Puesto, Integer>{
    
}
