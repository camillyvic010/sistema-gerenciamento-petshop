/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.service;

import br.ufmt.gerenciamentopetshop.service.dto.ClienteDTO;
import java.util.List;

/**
 *
 * @author aconf
 */
public interface ClienteService {
    
    public void salvar(ClienteDTO dto);
    public List<ClienteDTO> buscarTodos();
    public void deletar(String id);
    
}
