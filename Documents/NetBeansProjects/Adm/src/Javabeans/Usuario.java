/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;

public class Usuario {
    
    private int id;
    private String Nome;
    private String Email;
    private String Senha;
    private String EmailAlternativo;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public String getEmailAlternativo() {
        return EmailAlternativo;
    }

    public void setEmailAlternativo(String EmailAlternativo) {
        this.EmailAlternativo = EmailAlternativo;
    }
}