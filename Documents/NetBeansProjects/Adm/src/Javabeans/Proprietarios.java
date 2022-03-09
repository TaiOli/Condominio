/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;

public class Proprietarios {
    private int idProprietarios;
    private String Nome;
    private String email;
    private String Celular;
    private String Telefone;
    private String Propriedade;
   

    public int getIdProprietarios() {
        return idProprietarios;
    }

    public void setIdProprietarios(int idProprietarios) {
        this.idProprietarios = idProprietarios;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPropriedade() {
        return Propriedade;
    }

    public void setPropriedade(String Propriedade) {
        this.Propriedade = Propriedade;
    }
}
