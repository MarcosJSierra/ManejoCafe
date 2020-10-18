package org.kurokami.ManejoCafe.service;

import org.kurokami.ManejoCafe.Modelo.Proveedor;
import org.kurokami.ManejoCafe.dao.ProveedorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 *
 * @author malopez
 */
public class ProveedoresServiceImp implements ProveedoresService{

    @Autowired
    ProveedorDao proveedorDao;

    @Override
    public Proveedor proveedorPorId(Integer id) {
        return (Proveedor) proveedorDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Proveedor> getProveedores() {
        return (ArrayList<Proveedor>) proveedorDao.findAll();
    }
}
