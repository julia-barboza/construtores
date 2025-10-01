package ContaBancaria;

import java.util.Scanner;

public class ObjetoContaBancaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o saldo inicial da conta: ");
		double saldoInicial = sc.nextDouble();
		ContaBancaria conta = new ContaBancaria(saldoInicial);

		System.out.println("Saldo inicial: " + conta.getSaldo());

		System.out.print("Digite o valor para depositar: ");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("Saldo atual: " + conta.getSaldo());

		System.out.print("Digite outro valor para depositar: ");
		valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("Saldo atual: " + conta.getSaldo());

		System.out.print("Digite o valor para sacar: ");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);

		System.out.println("Saldo final: " + conta.getSaldo());

		sc.close();
	}
}
