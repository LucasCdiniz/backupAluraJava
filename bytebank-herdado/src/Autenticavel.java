//Interface funciona como um contrato
//quem assinar precisar� implementar os seus m�todos

public abstract interface Autenticavel {

	
	public abstract boolean autentica(int senha); 
	
	public abstract void setSenha(int senha);

}
