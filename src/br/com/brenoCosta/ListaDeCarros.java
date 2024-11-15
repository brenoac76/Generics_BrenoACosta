package br.com.brenoCosta;

import java.util.ArrayList;
import java.util.List;

// Classe genérica para uma lista de carros
public class ListaDeCarros<T extends Carro> {

    // Lista de carros
    private List<T> carros;

    // Construtor
    public ListaDeCarros() {
        carros = new ArrayList<>();
    }

    // Método para adicionar um carro à lista
    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    // Método para imprimir todos os carros da lista
    public void imprimirCarros() {
        for (T carro : carros) {
            carro.imprimirDetalhes();
        }
    }
}
