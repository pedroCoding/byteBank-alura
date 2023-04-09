package byteBankComposto;

public class TesteSaldoNegativo {

	public static void main(String[] args) {
		Conta pedro = new Conta();
		pedro.deposita(1100);
		pedro.sacar(100);
		
		pedro.pegaSaldo();

	}

}
