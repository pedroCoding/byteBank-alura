package byteBankComposto;

import java.util.Scanner;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	Scanner leia = new Scanner(System.in);

	
	//MÉTODO DEPOSITA (Não retorna nada - VOID)
	void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Deposito realizado com sucesso. O valor depositado é de: R$"+valor);
		System.out.println("");
	}
	
	//MÉTODO SACAR
	public boolean sacar(double valor){
		
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque efetuado com sucesso no valor de R$"+valor);
			return true;
		}else {
			System.out.println("Não foi possivel efetuar o saque. Valor indisponivel!");
			return false;
		}
	}
	
	
	//MÉTODO TRANSFERE
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transferencia realizada com sucesso no valor de R$"+valor);
		}else {
			System.out.println("Transferência não realizada! Saldo insuficiente.");
			return false;
		}
		return false;
	}

}
