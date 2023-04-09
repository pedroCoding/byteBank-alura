package byteBankComposto;

public class TesteContaSemCliente {

	public static void main(String[] args) {
		Conta contaSemCliente = new Conta();
		contaSemCliente.titular.nome = "Sem cliente";
		System.out.println(contaSemCliente.titular.nome);

	}

}
