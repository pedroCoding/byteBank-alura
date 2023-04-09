package byteBankComposto;

public class TesteSaldoNegativo {

	public static void main(String[] args) {
		Conta pedro = new Conta();
		pedro.deposita(100);
		pedro.sacar(200);
		
		System.out.println("O saldo na conta é de "+pedro.saldo);

	}

}
