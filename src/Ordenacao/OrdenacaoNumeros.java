package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    //Constructor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(22);
        numeros.adicionarNumero(9);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
    }
}
