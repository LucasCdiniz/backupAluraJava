
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente lucas = new Cliente();
		
		lucas.nome = "Lucas Diniz";
		lucas.cpf = "411.295.125-09";
		lucas.profissao = "Desenvolvedor";
		
		Conta contaDoLucas = new Conta();
		contaDoLucas.depositar(100);
		
		contaDoLucas.titular = lucas;
		
		System.out.println(contaDoLucas.titular.nome);
	}
}
