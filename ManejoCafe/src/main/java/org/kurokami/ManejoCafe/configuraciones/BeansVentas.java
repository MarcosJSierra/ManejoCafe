/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.configuraciones;

import org.kurokami.ManejoCafe.Modelo.ColaOrdenes;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author marcos
 */
@Configuration
public class BeansVentas {
        
    @Bean()
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ColaOrdenes getColaOrdenes(){
        return new ColaOrdenes();
    }
}
