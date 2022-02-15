
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 1337);
		cc.depositar(100);
		
		SeguroDeVida svd = new SeguroDeVida();
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(cc);
		calc.registra(svd);
		
		System.out.println(calc.getTotalImposto());

	}

}
