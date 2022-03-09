/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;

public class Reclamacao {
    
     private int idReclamacoes;
    private String Nome;
    private String Andar;
    private int NAndar;
    private String Observacao;

    public int getIdReclamacoes() {
        return idReclamacoes;
    }

    public void setIdReclamacoes(int idReclamacoes) {
        this.idReclamacoes = idReclamacoes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getAndar() {
        return Andar;
    }

    public void setAndar(String Andar) {
        this.Andar = Andar;
    }

    public int getNAndar() {
        return NAndar;
    }

    public void setNAndar(int NAndar) {
        this.NAndar = NAndar;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }    
}
