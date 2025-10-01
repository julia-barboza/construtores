package Construtor;

public class Animal {
    private float tamanho;
    private String cor;

    public Animal() {
        this.tamanho = 4.0f;
        this.cor = "Cinza";
    }

    public Animal(float tamanho) {
        this.tamanho = tamanho;
        this.cor = "Branco";
    }

    public Animal(float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void exibir() {
        System.out.println("Tamanho: " + tamanho + " | Cor: " + cor);
    }
}

