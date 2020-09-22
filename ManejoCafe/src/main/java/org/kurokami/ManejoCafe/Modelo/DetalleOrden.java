/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Entity
@Data
@Table(name="DetalleOrden")
public class DetalleOrden implements Serializable {
    private static final double serialVersionUID = 1L;
    
    @EmbeddedId
    private DetalleOrdenKey id;
    
    @ManyToOne
    @MapsId("idOrden")
    @JoinColumn(name="idOrden")
    private Orden orden;
   
    @ManyToOne
    @MapsId("idMenu")
    @JoinColumn(name="idMenu")
    private Menu menu;
    
    private Integer cantidad;
    
    @Column(name="precioVenta")
    private Double precioVenta;
    
    private Double subtotal;
    
    
    
    
}
