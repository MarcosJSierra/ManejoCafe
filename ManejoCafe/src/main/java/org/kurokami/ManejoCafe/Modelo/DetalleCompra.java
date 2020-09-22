/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.Modelo;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Entity
@Data
@Table(name = "detalleCompra")
public class DetalleCompra implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private DetalleOrdenKey detalleOrdenKey;
    
    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name="idCompra")
    private Compra compra;
    
    @ManyToOne
    @MapsId("idInventario")
    @JoinColumn(name="idInventario")
    private Inventario inventario;
    
    @Min(value = 0)
    private float cantidad;
    
    @Min(value = 0)
    private double subtotal;
    
    @Min(value = 0)
    private double precio;
}
