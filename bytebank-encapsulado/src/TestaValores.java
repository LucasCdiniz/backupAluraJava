
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,192);
		
		System.out.println();
		
		conta.setAgencia(-99);
		conta.setNumero(-875);
		
		System.out.println();
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		System.out.println();
		
		Conta conta1 = new Conta(1548,292);
		
		System.out.println();
		
		Conta conta2 = new Conta(9482,392);
		
		System.out.println(Conta.getTotal());
		
	}
}
