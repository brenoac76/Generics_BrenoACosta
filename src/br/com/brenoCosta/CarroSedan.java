package br.com.brenoCosta;

// Classe concreta que representa um tipo específico de Carro: CarroSedan
public class CarroSedan extends Carro {

    // Construtor
    public CarroSedan(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método abstrato
    @Override
    public void imprimirDetalhes() {
        System.out.println("Carro Sedan - Marca: " + getMarca() +
                ", Modelo: " + getModelo() +
                ", Ano: " + getAno());
    }
}