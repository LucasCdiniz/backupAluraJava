package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 350;
		
		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
	}
}
