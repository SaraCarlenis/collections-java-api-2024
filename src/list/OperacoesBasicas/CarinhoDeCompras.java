package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarinhoDeCompras {
        private List<Item> carrinho = new ArrayList<>();

        public void adicionarItem(String nome, double preco, int quantidade) {

            carrinho.add(new Item(nome, preco, quantidade));
        }

        public void removerItem(String nome) {
            for (Item i : carrinho) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    carrinho.remove(i);
                }
            }

        }
        public double calcularValorTotal() {
            double valorTotal = 0;
            for (Item i : carrinho) {
                valorTotal = valorTotal + i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        }
        public void exibirItens() {
            for (Item i : carrinho) {
                System.out.println("nome: " + i.getNome() + " preço: " + i.getPreco() + " quantidade: " + i.getQuantidade());
            }
        }
    }


