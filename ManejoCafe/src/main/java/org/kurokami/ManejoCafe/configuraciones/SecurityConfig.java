/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.configuraciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author marcos
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}123")
                .roles("ADMIN" )
                .and()
                .withUser("user")
                .password("{noop}123")
                .roles("CLIENTE")
                .and()
                .withUser("bar")
                .password("{noop}123")
                .roles("BARISTA");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/ventas/cola-ordenes")
                    .hasAnyRole("BARISTA", "ADMIN")
                .antMatchers("/ventas/atender-orden")
                    .hasAnyRole("BARISTA", "ADMIN")
                .antMatchers("/usuario/registro")
                    .hasAnyRole("ADMIN")
                .and()
                    .formLogin()
                    .loginPage("/login");
    }
}
