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
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author marcos
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    @Override
    public void addViewControllers(ViewControllerRegistry registro){
//        registro.addViewController("/").setViewName("mainsite/index");
        registro.addViewController("/login");
    }
    
    @Bean()
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ColaOrdenes getColaOrdenes(){
        return new ColaOrdenes();
    }
}
