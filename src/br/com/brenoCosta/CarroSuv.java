package br.com.brenoCosta;

// Classe concreta que representa um tipo específico de Carro: CarroSedan
public class CarroSuv extends Carro {

    // Construtor
    public CarroSuv(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Implementação do método abstrato
    @Override
    public void imprimirDetalhes() {
        System.out.println("Carro SUV - Marca: " + getMarca() +
                ", Modelo: " + getModelo() +
                ", Ano: " + getAno());
    }
}
