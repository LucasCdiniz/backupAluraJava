//Abstract na classe significa que não pode instanciar um novo objeto desta classe
//não pode new Funcionario();
public abstract class Funcionario {

	private String nome;
	private String cpf;
	
	//protected deixa o acesso liberado apenas para as classes fillho
	// para as demais que não são extendidas não é liberado o uso 
	private double salario;
	
//	Abstract no método significa que não há implementação por aqui, 
//	mas, pode ter a implementação nos filhos, tendo o método na mãe você obriga os filhos a implementarem ele
	
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
