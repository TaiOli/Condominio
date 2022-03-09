/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;

public class Espaço {
    
    private int idEspaço;
    private String DataInicio;
    private String DataFim;
    private String HoraInicio;
    private String HoraEntrega;
    private double Preco;
    private String Apartamento;
    private String Nome;
    

    public int getIdEspaço() {
        return idEspaço;
    }

    public void setIdEspaço(int idEspaço) {
        this.idEspaço = idEspaço;
    }
    
     public String getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public String getDataFim() {
        return DataFim;
    }

    public void setDataFim(String DataFim) {
        this.DataFim = DataFim;
    }
    
    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }
    public String getHoraEntrega() {
        return HoraEntrega;
    }

    public void setHoraEntrega(String HoraEntrega) {
        this.HoraEntrega = HoraEntrega;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
     public String getApartamento() {
        return Apartamento;
    }

    public void setApartamento(String Apartamento) {
        this.Apartamento = Apartamento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    } 
}
