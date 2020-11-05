/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.configuraciones;

import org.springframework.context.annotation.Configuration;
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
        registro.addViewController("/error/403").setViewName("/error/403");
        registro.addViewController("/error/404").setViewName("/error/404");
        registro.addViewController("/error/500").setViewName("/error/500");

    }
}
