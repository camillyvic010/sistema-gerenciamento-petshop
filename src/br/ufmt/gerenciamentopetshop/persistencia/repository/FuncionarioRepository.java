/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.persistencia.repository;

import br.ufmt.gerenciamentopetshop.persistencia.entidade.Funcionario;
import java.util.List;

/**
 *
 * @author aconf
 */
public interface FuncionarioRepository {
    
    public void inserir(Funcionario funcionario);
    public List<Funcionario> buscar();
    public void alterar(Funcionario funcionario);
    public void deletar(Funcionario funcionario);
}
