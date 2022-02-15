//Abstract na classe significa que n�o pode instanciar um novo objeto desta classe
//n�o pode new Funcionario();
public abstract class Funcionario {

	private String nome;
	private String cpf;
	
	//protected deixa o acesso liberado apenas para as classes fillho
	// para as demais que n�o s�o extendidas n�o � liberado o uso 
	private double salario;
	
//	Abstract no m�todo significa que n�o h� implementa��o por aqui, 
//	mas, pode ter a implementa��o nos filhos, tendo o m�todo na m�e voc� obriga os filhos a implementarem ele
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
