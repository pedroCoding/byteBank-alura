package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 200;

		
		System.out.println("Saldo 1° conta antes da transferencia: R$"+primeiraConta.saldo);
		System.out.println("Saldo 2° conta antes da transferencia: R$"+segundaConta.saldo);
		
		System.out.println("");
		segundaConta.transfere(200, primeiraConta);
		System.out.println("");
		
		
		System.out.println("Saldo 1° conta apos a transferencia: R$"+primeiraConta.saldo);
		System.out.println("Saldo 2° conta apos a transferencia: R$"+segundaConta.saldo);
		

	}

}
