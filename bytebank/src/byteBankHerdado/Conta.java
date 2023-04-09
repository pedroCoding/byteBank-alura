package byteBankHerdado;

import java.util.Scanner;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
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
	
	
	
	
	
	
	
	
	
	public double getSaldo() {
		if(saldo <= 0) {
			System.out.println("O seu saldo atualmente é de R$0,00");
		}else {
			System.out.println("Seu saldo é de : R$"+this.saldo);
			
		}
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
