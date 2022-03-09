/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;

public class TelefonesUteis {
    
     
    private int idTelefonesUteis;
    private String Nome;
    private String Celular;
    private String Telefone;
    private String Observacao;

    
     public int getIdTelefonesUteis() {
        return idTelefonesUteis;
    }

    public void setIdTelefonesUteis(int idTelefonesUteis) {
        this.idTelefonesUteis = idTelefonesUteis;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
     public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
}
