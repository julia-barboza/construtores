package Construtor;

public class Consulta {
    private String data;
    private String nomePcte;
    private String nomeDents;

    public Consulta() {
        this.data = "07.09.2025";
        this.nomePcte = "Júlia Barboza";
        this.nomeDents = "Dr. Nicolas Gomes";
    }

    public Consulta(String nomePcte, String nomeDents) {
        this.data = "28.09.2025";
        this.nomePcte = nomePcte;
        this.nomeDents = nomeDents;
    }

    public Consulta(String data, String nomePcte, String nomeDents) {
        this.data = data;
        this.nomePcte = nomePcte;
        this.nomeDents = nomeDents;
    }

    public void exibir() {
        System.out.println("Data: " + data + " | Paciente: " + nomePcte + " | Dentista: " + nomeDents);
    }
}
