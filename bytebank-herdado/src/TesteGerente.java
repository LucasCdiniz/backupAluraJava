
public class TesteGerente {

	public static void main(String[] args) {
		 Gerente g1 = new Gerente();
		 
		 g1.setNome("Luis");
		 System.out.println(g1.getNome());
		 g1.setSalario(5000);
		 
		 g1.setSenha(222);
		 
		boolean taserto =  g1.autentica(222);
		 
		 System.out.println(taserto);
		 
		 System.out.println(g1.getBonificacao());
	}
}
