
public class TestaGetESet {
	public static void main(String[] args) {
		Contas conta = new Contas(1337, 24226);

		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();
		// conta.titular = paulo;
		paulo.setNome("paulo silveira");

		conta.setTitular(paulo);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("programador");
		// agora em 2 linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");

		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());

	}
}
