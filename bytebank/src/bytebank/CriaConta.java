package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		
		
		
		System.out.println("O saldo da primeira conta é: "+primeiraConta.saldo);
		System.out.println("O saldo da segunda conta é: "+segundaConta.saldo);
		

	}

}
