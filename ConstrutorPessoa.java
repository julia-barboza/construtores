package Construtor;

public class ConstrutorPessoa {

	public static void main(String [] args) {
		
		Pessoa jogador = new Pessoa("Cristiano",40);
		
		System.out.println(jogador.getNome());
		System.out.println(jogador.getIdade());
	}
}
