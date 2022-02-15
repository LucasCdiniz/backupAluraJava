public class Gerente extends Funcionario implements Autenticavel{
//	Em caso de ser private salario, podemos fazer assim:
//	public double getBonificacao() {
//		return this.getSalario();
//	}
	
	//Em caso de ser protected salario, 
	//ele fica visível para todas as classes filhas
	
	//super indica que o atributo não está definida nesta classe
	// apenas na superclasse/ classe mãe
	
	private int senha;
	private AutenticadorUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticadorUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação do Gerente");
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
