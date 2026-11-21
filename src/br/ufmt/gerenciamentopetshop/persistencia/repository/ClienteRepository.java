/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.persistencia.repository;

import br.ufmt.gerenciamentopetshop.persistencia.entidade.Cliente;
import java.util.List;

/**
 *
 * @author aconf
 */
public interface ClienteRepository {
    
    public void inserir(Cliente cliente);
    public List<Cliente> buscar();
    public void alterar(Cliente cliente);
    public void deletar(Cliente cliente);
}
