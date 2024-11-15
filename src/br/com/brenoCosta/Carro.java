package br.com.brenoCosta;

// Classe abstrata que representa um Carro
public abstract class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Método abstrato para imprimir detalhes do carro
    public abstract void imprimirDetalhes();
}