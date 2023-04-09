package bytebank;

public class TesteReferencia {
	public static void main(String[]args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		primeiraConta.saldo = 1500;
		
		segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta:"+segundaConta.saldo);
		
		primeiraConta.saldo +=200;
		
		System.out.println("Saldo da segunda conta:"+segundaConta.saldo);
		
	}

}
