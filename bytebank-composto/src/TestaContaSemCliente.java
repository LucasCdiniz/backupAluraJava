
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaMarcia = new Conta();
		System.out.println(contaDaMarcia.getSaldo());
		
		contaDaMarcia.titular = new Cliente();
		
		System.out.println(contaDaMarcia.titular);
		
		contaDaMarcia.titular.nome = "Marcia Diniz";
		System.out.println(contaDaMarcia.titular.nome);
	}
}
