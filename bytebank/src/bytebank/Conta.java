package bytebank;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//MÉTODO DEPOSITA (Não retorna nada - VOID)
	void deposita(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Deposito realizado com sucesso. O valor depositado é de: R$"+valor);
	}
	
	//MÉTODO SACAR
	

}
