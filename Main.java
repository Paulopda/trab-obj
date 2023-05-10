import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("João", "Rua A, 123", "123456789");

        // Criando um produto
        Produto produto = new Produto("Coca-Cola", 3.5);

        // Criando uma venda com o cliente, o produto e o preço
        Venda venda = new Venda(cliente, produto, 3.5);

        // Imprimindo os dados da venda
        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Produto: " + venda.getProduto().getNome());
        System.out.println("Preço: " + venda.getPreco());
    }
}
