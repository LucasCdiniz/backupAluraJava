public class Gerente extends Funcionario implements Autenticavel{
//	Em caso de ser private salario, podemos fazer assim:
//	public double getBonificacao() {
//		return this.getSalario();
//	}
	
	//Em caso de ser protected salario, 
	//ele fica vis�vel para todas as classes filhas
	
	//super indica que o atributo n�o est� definida nesta classe
	// apenas na superclasse/ classe m�e
	
	private int senha;
	private AutenticadorUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticadorUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Bonifica��o do Gerente");
		return super.getSalario();
		}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}
