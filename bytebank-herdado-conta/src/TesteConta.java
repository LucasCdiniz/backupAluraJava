
public class TesteConta {

	public static void main(String[] args) {
		
		
		
		ContaCorrente cc = new ContaCorrente(111, 1337);
		cc.depositar(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 1338);
		cp.depositar(200);
		
		
		cc.transferir(50, cp);
		
		System.out.println("\nConta Corrente: " + 
		cc.getSaldo());
		
		System.out.println("\nConta Poupança: " + 
		cp.getSaldo());
	}

}
