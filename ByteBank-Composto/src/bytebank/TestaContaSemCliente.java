package bytebank;

public class TestaContaSemCliente {
public static void main(String[] args) {
	Contas ContaDaMarcela = new Contas();
	
	System.out.println(ContaDaMarcela.saldo);
	
	ContaDaMarcela.titular = new Cliente();
	System.out.println(ContaDaMarcela.titular);

	ContaDaMarcela.titular.nome = "Marcela";
	System.out.println(ContaDaMarcela.titular.nome);
}
}
