/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Entity
@Data
@Table(name="Usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdUsuario;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String password;
    
    @NotEmpty
    private String direccion;
    
    @NotEmpty
    private String correo;
    
    @NotEmpty
    private String telefono;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "Puesto_id")
    private Puesto puesto;
    
}
