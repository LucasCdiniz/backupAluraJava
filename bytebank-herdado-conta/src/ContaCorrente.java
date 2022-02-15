
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.5;
		return super.sacar(valorASacar);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo+=valor;
	}

	@Override
	public double getValorImpostos() {
		return super.saldo * 0.1;
	}
}
