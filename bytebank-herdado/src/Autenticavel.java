//Interface funciona como um contrato
//quem assinar precisará implementar os seus métodos

public abstract interface Autenticavel {

	
	public abstract boolean autentica(int senha); 
	
	public abstract void setSenha(int senha);

}
