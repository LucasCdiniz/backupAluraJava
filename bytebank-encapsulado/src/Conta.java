

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//STATIC é um atributo da Classe e não um atributo de instância
	private static int total;
	
	//*****************************************************
	
		//CONSTRUTOR
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		System.out.println("O total de contas é: " + total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Inicializando o meu Construtor\nNúmero da Conta: " + numero + 
				"\tNúmero da Agência: " + agencia);
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
		this.saldo+=valor;
		}else {
			System.out.println("Operação não realizada");
		}
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && this.saldo >= valor) {
			this.saldo-=valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta destino) {
		if(valor > 0 && this.saldo>=valor) {
			this.saldo-=valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	// **********************************************
	
	// Getters e Setters
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("ERRO: Não é permitido valores negativos ou iguais a zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("ERRO: Não é permitido valores negativos ou iguais a zero");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
