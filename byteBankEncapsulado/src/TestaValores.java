
public class TestaValores {
	public static void main(String[] args) {
		Contas conta = new Contas(1337, 24226);

		// conta está inconsistente
		conta.setAgencia(-50);
		conta.setNumero(-330);

		System.out.println(conta.getAgencia());

		conta.setAgencia(1232123);

		Contas conta2 = new Contas(1337, 16549);
		Contas conta3 = new Contas(2112, 14660);

		System.out.println(Contas.getTotal());

	}

}
