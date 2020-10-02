/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kurokami.ManejoCafe.service;

import java.util.List;
import org.kurokami.ManejoCafe.Modelo.Cliente;
import org.kurokami.ManejoCafe.Modelo.Puesto;
import org.kurokami.ManejoCafe.Modelo.Usuario;
import org.kurokami.ManejoCafe.dao.ClienteDao;
import org.kurokami.ManejoCafe.dao.PuestoDao;
import org.kurokami.ManejoCafe.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marcos
 */
@Service
public class MainsiteServiceImp implements MainsiteService {

    @Autowired
    private PuestoDao puestoDao;
    
    @Autowired
    private ClienteDao clienteDao;
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    @Override
    public List<Puesto> listarPuestos() {
        return (List<Puesto>) puestoDao.findAll();
    }

    @Override
    public Puesto puestoPorId(int id) {
        return (Puesto) puestoDao.findById(id).orElse(null);
    }

    @Override
    public void registrarCliente(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDao.save(usuario);
    }
    

}
