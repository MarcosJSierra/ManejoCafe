/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name="compra")
public class Compra implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCompra")
    private Integer idCompra;
    
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @NotEmpty
    @Column(name="no_factura")
    private String noFactura;
    
    @NotNull
    @Min(value = 0)
    private double total;
    
    @ManyToOne
    @JoinColumn(name="idProveedor")
    private Proveedor proveedor;
    
}
