package Construtor;

public class Carro {
    private String placa;
    private int numChassi;

    public Carro() {
        this.placa = "KAZ-2Y5";
        this.numChassi = 677;
    }

    public Carro(String placa) {
        this.placa = placa;
        this.numChassi = 123;
    }

    public Carro(String placa, int numChassi) {
        this.placa = placa;
        this.numChassi = numChassi;
    }

    public void exibir() {
        System.out.println("Placa: " + placa + " | Chassi: " + numChassi);
    }
}
