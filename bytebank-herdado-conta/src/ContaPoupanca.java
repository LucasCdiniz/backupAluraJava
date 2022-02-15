// Ao extender n�o � herdado o construtor da classe m�e, � preciso criar o construtor da classe filho passando os 
// par�metros do construtor espec�fico da classe m�e e incluindo o super, fazendo refer�ncia/chamada do construtor da classe m�e
// ao que est� acima desta classe

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor + 0.2;
		return super.sacar(valorASacar);
	}

	@Override
	public void depositar(double valor) {
		super.saldo+=valor;		
	}

}
