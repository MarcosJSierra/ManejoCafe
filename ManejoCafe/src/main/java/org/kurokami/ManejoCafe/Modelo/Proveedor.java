/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Entity
@Data
@Table(name="proveedor")
public class Proveedor implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProveedor")
    private Integer idProveedor;
    
    @NotEmpty
    @Column(name="NIT")
    private String nit;
    
    @NotEmpty
    @Column(name="No_cuenta")
    private String noCuenta;
    
    @NotNull
    @Column(name="saldoPendiente")
    @Min(value = 0)
    private double saldoPendiente;
    
    @NotEmpty
    private String direccion;
    
    @NotEmpty
    private String nombre;
    
    private String telefono;
    
    @Email
    private String correo;
    
}
