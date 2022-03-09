/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javabeans;

public class ContasPagar {
    
    private int idContasPagar;
    private String Descricao;
    private String Fornecedor;
    private String DataInicio;
    private String Vencimento;
    private Double ValorLiquido;
    private String Situacao;

    public int getIdContasPagar() {
        return idContasPagar;
    }

    public void setIdContasPagar(int idContasPagar) {
        this.idContasPagar = idContasPagar;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public String getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public String getVencimento() {
        return Vencimento;
    }

    public void setVencimento(String Vencimento) {
        this.Vencimento = Vencimento;
    }

    public Double getValorLiquido() {
        return ValorLiquido;
    }

    public void setValorLiquido(Double ValorLiquido) {
        this.ValorLiquido = ValorLiquido;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }  
}
