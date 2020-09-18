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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Entity
@Data
@Table(name="Cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idCliente;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String direccion;
    
    @NotEmpty
    @Email
    private String Correo;
    
    @NotEmpty
    private String  Telefono;
    
    @Min(value = 0)
    private double saldo;
    
    @ManyToOne
    @JoinColumn(name = "Puesto_id")
    private Puesto puesto;
    
    @NotEmpty
    private String password;
    
}
