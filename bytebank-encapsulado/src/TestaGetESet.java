
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,555);
		Conta contaDoAle = new Conta(1337,456);
		
		//conta.numero = 1337
		conta.setNumero(1337);
		System.out.println("Conta: " + 
		conta.getNumero());
		
		conta.setAgencia(192);
		System.out.println("Agência: " + 
		conta.getAgencia());
		
		conta.depositar(1500);
		System.out.println("Saldo atual: " + 
		conta.getSaldo());
		
		Cliente lucas = new Cliente();
		lucas.setNome("Lucas Diniz");
		lucas.setCpf("123.456.789.00");
		lucas.setProfissao("Programador");
		
		conta.setTitular(lucas);
		
		System.out.println("Nome do Titular: " + 
		conta.getTitular().getNome());
		
		System.out.println("Profissão: " + 
				conta.getTitular().getProfissao());
		
		conta.getTitular().setProfissao("Desenvolvedor");
		
		System.out.println("Profissão: " + 
				conta.getTitular().getProfissao());
		
		conta.depositar(500);
		System.out.println(conta.getSaldo());
		
		System.out.println(conta.sacar(250));
		System.out.println(conta.getSaldo());
		
		conta.transferir(25, contaDoAle);
		
		System.out.println("Saldo da conta do Lu: " + 
		conta.getSaldo());
		
		System.out.println("Saldo da Conto do Ale: " + 
		contaDoAle.getSaldo());
	}
}
