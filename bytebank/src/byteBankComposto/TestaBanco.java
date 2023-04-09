package byteBankComposto;

public class TestaBanco {

	public static void main(String[] args) {
		
		//Criação cliente
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Lucas Silva Barbosa";
		pedro.profissao = "Programador";
		pedro.cpf = "082.900.443-21";

		//Criação conta
		Conta contaDoPedro = new Conta();
		contaDoPedro.deposita(100);
		
		
		//Referencia a conta ao titular... Já criado!
		contaDoPedro.titular = pedro;
		System.out.println(contaDoPedro);
		System.out.println(contaDoPedro.titular.nome);
		System.out.println(contaDoPedro.titular.cpf);
		System.out.println(contaDoPedro.titular.profissao);
		
	}

}
