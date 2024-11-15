package br.com.brenoCosta;
public class Main {
    public static void main(String[] args) {
        // Criação da lista genérica de carros
        ListaDeCarros<CarroSedan> listaSedans = new ListaDeCarros<>();
        ListaDeCarros<CarroSuv> listaSUVs = new ListaDeCarros<>();

        // Adicionando carros Sedan à lista
        listaSedans.adicionarCarro(new CarroSedan("Toyota", "Corolla", 2022));
        listaSedans.adicionarCarro(new CarroSedan("Honda", "Civic", 2021));
        listaSedans.adicionarCarro(new CarroSedan("Chevrolet", "Cruze", 2020));

        // Adicionando carros SUV à lista
        listaSUVs.adicionarCarro(new CarroSuv("Jeep", "Compass", 2023));
        listaSUVs.adicionarCarro(new CarroSuv("Ford", "EcoSport", 2022));
        listaSUVs.adicionarCarro(new CarroSuv("Hyundai", "Tucson", 2021));

        // Imprimindo os carros Sedan da lista
        System.out.println("Carros Sedan:");
        listaSedans.imprimirCarros();

        // Imprimindo os carros SUV da lista
        System.out.println("\nCarros SUV:");
        listaSUVs.imprimirCarros();
    }
}