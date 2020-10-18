package org.kurokami.ManejoCafe.service;

import org.kurokami.ManejoCafe.Modelo.Compra;
import org.kurokami.ManejoCafe.dao.CompraDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 *
 * @author malopez
 */
public class ComprasServiceImp implements ComprasService{

    @Autowired
    CompraDao compraDao;

    @Override
    public Compra compraPorId(Integer id) {
        return (Compra) compraDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Compra> getCompras() {
        return (ArrayList<Compra>) compraDao.findAll();
    }
}
