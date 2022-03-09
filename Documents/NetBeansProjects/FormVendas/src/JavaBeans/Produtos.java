package JavaBeans;

/**
 *
 * @author Tais Oliveira
 */
public class Produtos {

    int Id;
    String Codigo;
    String Descricao;
    double Preco;
    int Estoque;
    int Quantidade;
    
     public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    } 
    
    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    } 
}
