package org.kurokami.ManejoCafe.service;

import org.kurokami.ManejoCafe.Modelo.Compra;

import java.util.ArrayList;

/**
 *
 * @author malopez
 */
public interface ComprasService {
    public Compra compraPorId(Integer id);

    public ArrayList<Compra> getCompras();
}
