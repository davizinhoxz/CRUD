public class Produto {
    public int id;
    public String refProduto;
    public String produto;
    public int preco;

    public Produto (int id, String refProduto, String produto, int preco) {
        this.id = id;
        this.refProduto = refProduto;
        this.produto = produto;
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return refProduto;
        }
    }
