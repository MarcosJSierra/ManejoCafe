/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

/**
 *
 * @author marcos
 */
@Embeddable
@Data
public class IngedienteMenuKey implements Serializable {
    @Column(name="idMenu")
    Long idMenu;
    
    @Column(name="idInventario")
    Long idInvetario;
}
