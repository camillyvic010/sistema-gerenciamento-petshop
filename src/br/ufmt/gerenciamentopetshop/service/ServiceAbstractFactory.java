/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.service;

import br.ufmt.gerenciamentopetshop.service.impl.ClienteServiceImpl;

/**
 *
 * @author aconf
 */
public class ServiceAbstractFactory {
    
    public static ClienteService criarClienteService() {
        return new ClienteServiceImpl();
    }
    
}
