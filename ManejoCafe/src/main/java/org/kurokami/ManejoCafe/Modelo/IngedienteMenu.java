/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.Modelo;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Entity
@Data
@Table(name="IngredienteMenu")
public class IngedienteMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    private DetalleOrdenKey detalleOrdenKey;
    
    @ManyToOne
    @MapsId("idMenu")
    @JoinColumn(name="idMenu")
    private Menu menu;
    
    
    @ManyToOne
    @MapsId("idInventario")
    @JoinColumn(name="idInventario")
    private Inventario inventario;
    
    @NotNull
    private double cantidad;
}
