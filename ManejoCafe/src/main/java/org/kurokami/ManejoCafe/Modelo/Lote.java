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
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Data
@Entity
@Table(name="lote")
public class Lote implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLote")
    private Integer idLote;
    
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date fecha;
    
    @NotNull
    private int existencia;
    
    @NotNull
    private Boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "idInventario")
    private Inventario inventario;
}
