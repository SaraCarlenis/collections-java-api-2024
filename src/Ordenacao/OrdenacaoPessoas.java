package Ordenacao;

import java.util.*;

public class OrdenacaoPessoas {

    private List<Pessoas> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenadoPorIdade() {
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoas> ordenadoPorAltura() {
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura);
        return pessoasPorAltura;

    }
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoas("Nome 1", 20, 1.50);
        ordenacaoPessoas.adicionarPessoas("Nome 2", 28, 1.77);
        ordenacaoPessoas.adicionarPessoas("Nome 3", 50, 1.84);
        ordenacaoPessoas.adicionarPessoas("Nome 4", 15, 1.66);

        System.out.println(ordenacaoPessoas.pessoasList);
        System.out.println(ordenacaoPessoas.ordenadoPorIdade());
        System.out.println(ordenacaoPessoas.ordenadoPorAltura());

    }
}
