package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }
    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int numeroMaior = Integer.MIN_VALUE;
        if(!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= numeroMaior)
                    numeroMaior = numero;
            }
        }
        return numeroMaior;
    }
    public int encontrarMenorNumero() {
        int numeroMenor = Integer.MAX_VALUE;

        if(!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= numeroMenor)
                    numeroMenor = numero;
            }
        }
        return numeroMenor;

    }

    public void exibirNumeros() {
        if (numeros.isEmpty()) {
            System.out.println("Lista de números vazia.");
        } else {
            System.out.println("A lista de números é " + numeros);
        }
    }
}

