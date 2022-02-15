// Ao extender não é herdado o construtor da classe mãe, é preciso criar o construtor da classe filho passando os 
// parâmetros do construtor específico da classe mãe e incluindo o super, fazendo referência/chamada do construtor da classe mãe
// ao que está acima desta classe

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
