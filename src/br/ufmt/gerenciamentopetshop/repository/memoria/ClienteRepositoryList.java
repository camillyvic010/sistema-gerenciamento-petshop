/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.repository.memoria;
import br.ufmt.gerenciamentopetshop.persistencia.entidade.Cliente;
import br.ufmt.gerenciamentopetshop.persistencia.repository.ClienteRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aconf
 */
public class ClienteRepositoryList implements ClienteRepository {

     private List<Cliente> banco = new ArrayList<>();
    
    @Override
    public void inserir(Cliente cliente) {
        System.out.println("Inserindo cliente.");
        banco.add(cliente);
    }

    @Override
    public List<Cliente> buscar() {
        System.out.println("Retornando a lista.");
        return banco;
    }

    @Override
    public void alterar(Cliente cliente) {
           System.out.println("Alterando cliente.");
        for (int i = 0; i < banco.size(); i++) {
            if (cliente.getId() == banco.get(i).getId()) {
                banco.set(i, cliente);
            }
        }
    }

    @Override
    public void deletar(Cliente cliente) {
    System.out.println("Deletando cliente.");
        for (int i = 0; i < banco.size(); i++) {
            if (cliente.getId() == banco.get(i).getId()) {
                banco.remove(i);
            }
        }
    }
    
}
