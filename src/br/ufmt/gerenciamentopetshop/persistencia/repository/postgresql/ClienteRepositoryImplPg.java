/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.persistencia.repository.postgresql;

import br.ufmt.gerenciamentopetshop.persistencia.entidade.Cliente;
import br.ufmt.gerenciamentopetshop.persistencia.repository.ClienteRepository;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author aconf
 */
public class ClienteRepositoryImplPg implements ClienteRepository {

    private Connection conexao;
    public BancoDados banco;
    
    @Override
    public void inserir(Cliente cliente) {
        banco.abrirConexao();
        
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email) VALUES (";
        sql = sql + "'" + cliente.getNome() + "', ";
        sql = sql + "'" + cliente.getCpf() + "', ";
        sql = sql + "'" + cliente.getTelefone()+ "', ";
        System.out.println(sql);
        try {
            conexao.createStatement().execute(sql);
        } catch (Exception erro){
            erro.printStackTrace();
            throw new RuntimeException("Erro ao salvar!");
        }
        banco.fecharConexao();
    }

    @Override
    public List<Cliente> buscar() {
        List<Cliente> lista = new ArrayList<>();
        banco.abrirConexao();
        
        String sql = "SELECT * FROM cliente;";
        System.out.println(sql);
        try {
            ResultSet rs = conexao.createStatement().executeQuery(sql);
            while(rs.next()){
                Cliente c = new Cliente();
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                c.setId(rs.getInt("id"));
                
                lista.add(c);
                
            }
        } catch (Exception erro){
            erro.printStackTrace();
            throw new RuntimeException("Erro ao buscar!");
        }
        banco.fecharConexao();
        return lista;
    }

    @Override
    public void alterar(Cliente cliente) {
        banco.abrirConexao();
        
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ? WHERE id = ?;";
        try {
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getTelefone());
            pstm.setInt(4, cliente.getId());
            
            pstm.execute();
        } catch (Exception erro){
            erro.printStackTrace();
            throw new RuntimeException("Erro ao salvar!");
        }
        
        banco.fecharConexao();
    }

    @Override
    public void deletar(Cliente cliente) {
        banco.abrirConexao();
        
        String sql = "DELETE FROM cliente WHERE id = ?;";
        try {
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, cliente.getId());
            
            pstm.execute();
        } catch (Exception erro){
            erro.printStackTrace();
            throw new RuntimeException("Erro ao deletar!");
        }
        
        banco.fecharConexao();
    }
    
}
