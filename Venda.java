public class Venda {
    private Cliente cliente;
    private Produto produto;
    private double preco;

    public Venda(Cliente cliente, Produto produto, double preco) {
        this.cliente = cliente;
        this.produto = produto;
        this.preco = preco;
    }

    // getters e setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
