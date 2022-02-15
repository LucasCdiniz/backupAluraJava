
public class TesteReferencias {

	public static void main(String[] args) {
		
//		Gerente g1 = new Gerente();
		
		//Polimorfismo
		
		//refer�ncia do tipo mais gen�rico
		Funcionario g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000);
		
		Funcionario edv = new EditorVideo();
		edv.setSalario(2500);
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(edv);
		cb.registra(g1);
		
		
		System.out.println(cb.getSoma());
	}

}
