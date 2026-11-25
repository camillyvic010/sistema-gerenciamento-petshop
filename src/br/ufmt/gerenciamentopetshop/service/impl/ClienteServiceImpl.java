/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.service.impl;

import br.ufmt.gerenciamentopetshop.persistencia.repository.ClienteRepository;
import br.ufmt.gerenciamentopetshop.persistencia.repository.RepositoryAbstractFactory;
import br.ufmt.gerenciamentopetshop.service.ClienteService;
import br.ufmt.gerenciamentopetshop.service.dto.ClienteDTO;
import java.util.List;

/**
 *
 * @author aconf
 */
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository repository = RepositoryAbstractFactory.criarClienteRepository();
    
    @Override
    public void salvar(ClienteDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ClienteDTO> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
