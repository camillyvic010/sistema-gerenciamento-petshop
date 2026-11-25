/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.persistencia.repository;

import br.ufmt.gerenciamentopetshop.persistencia.repository.postgresql.ClienteRepositoryImplPg;

/**
 *
 * @author aconf
 */
public class RepositoryAbstractFactory {
    
    public static ClienteRepository criarClienteRepository() {
        return new ClienteRepositoryImplPg();
    }
    
}
