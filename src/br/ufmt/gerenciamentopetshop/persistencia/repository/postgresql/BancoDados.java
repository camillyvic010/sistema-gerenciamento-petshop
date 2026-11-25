/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.persistencia.repository.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aconf
 */
public class BancoDados {
    
    private Connection conexao;
    
    public void abrirConexao(){
        try {
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db", "postgres", "123456");
        } catch (Exception erro){
            erro.printStackTrace();
            throw new RuntimeException("Falha na conexão!");
        }
    }
    
    public void fecharConexao(){
        try {
            conexao.close();
        } catch (Exception erro){
            erro.printStackTrace();
            throw new RuntimeException("Falha na conexão!");
        }
    }
    
}
