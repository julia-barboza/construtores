package Construtor;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        Carro c2 = new Carro("CNK-80Q3");
        Carro c3 = new Carro("XYZ-9876", 54321);

        c1.exibir();
        c2.exibir();
        c3.exibir();

        System.out.println("-----");

        Animal a1 = new Animal();
        Animal a2 = new Animal(1.75f);
        Animal a3 = new Animal(0.40f, "Marrom");

        a1.exibir();
        a2.exibir();
        a3.exibir();

        System.out.println("-----");

        Consulta cons1 = new Consulta();
        Consulta cons2 = new Consulta("Maria Luiza", "Dr. Gustavo");
        Consulta cons3 = new Consulta("01/10/2025", "Nayara", "Dr. Murillo");

        cons1.exibir();
        cons2.exibir();
        cons3.exibir();
    }
}
