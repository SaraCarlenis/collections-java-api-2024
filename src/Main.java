import list.OperacoesBasicas.CarinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarinhoDeCompras carrinho = new CarinhoDeCompras();
        carrinho.adicionarItem("Arroz", 3.40, 3);
        System.out.println("O valor total do carrinho é: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();
        }
}
