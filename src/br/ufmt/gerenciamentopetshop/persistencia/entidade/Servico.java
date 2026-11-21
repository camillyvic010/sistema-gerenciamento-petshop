/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.persistencia.entidade;

/**
 *
 * @author aconf
 */
public class Servico extends EntidadeBase {
    private String tipo;
    private float valorBasef;
    private boolean precoVariavel;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValorBasef() {
        return valorBasef;
    }

    public void setValorBasef(float valorBasef) {
        this.valorBasef = valorBasef;
    }

    public boolean isPrecoVariavel() {
        return precoVariavel;
    }

    public void setPrecoVariavel(boolean precoVariavel) {
        this.precoVariavel = precoVariavel;
    }
    
    
}
