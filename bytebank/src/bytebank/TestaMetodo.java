package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoLucas = new Conta();
		
		contaDoLucas.saldo = 100;
		contaDoLucas.depositar(50);
		System.out.println(contaDoLucas.saldo);
		
		
		System.out.println("----------------");
		
		boolean conseguiRetirar = contaDoLucas.sacar(50);
		System.out.println(contaDoLucas.saldo);
		System.out.println(conseguiRetirar);
		
		
		System.out.println("----------------");
		
		
		Conta contaDaMarcia = new Conta();
		contaDaMarcia.depositar(1000);
		
		boolean sucessoTranferencia = 
				contaDaMarcia.transferir(300, contaDoLucas);
		if(sucessoTranferencia) {
			System.out.println("Transferência feita com sucesso");
		}else {
			System.out.println("Operação não realizada");
		}
		
		System.out.println("Conta da Marcia: " + contaDaMarcia.saldo);
		
		System.out.println("Conta do Lucas: " + contaDoLucas.saldo);

		
		System.out.println("----------------");
		
		
		contaDoLucas.titular = "Lucas Diniz";
		System.out.println(contaDoLucas.titular);
		
	}
}
