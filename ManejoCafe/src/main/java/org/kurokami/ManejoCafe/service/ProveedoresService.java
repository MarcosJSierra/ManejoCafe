package org.kurokami.ManejoCafe.service;

import org.kurokami.ManejoCafe.Modelo.Proveedor;

import java.util.ArrayList;

/**
 *
 * @author malopez
 */
public interface ProveedoresService {
    public Proveedor proveedorPorId(Integer id);

    public ArrayList<Proveedor> getProveedores();
}
