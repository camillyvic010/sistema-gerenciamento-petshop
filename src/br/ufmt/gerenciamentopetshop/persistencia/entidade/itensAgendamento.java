/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.gerenciamentopetshop.persistencia.entidade;

/**
 *
 * @author aconf
 */
public class itensAgendamento {
    private Agendamento agendamento;
    private Servico servico;
    private float valorFinalf;

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValorFinalf() {
        return valorFinalf;
    }

    public void setValorFinalf(float valorFinalf) {
        this.valorFinalf = valorFinalf;
    }
    
    
}
