package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente Paulo = new Cliente();
		Paulo.nome = "Paulo Silveira";
		Paulo.cpf = "222.222.222-22";
		Paulo.profissao = "programador";

		Contas ContaDoPaulo = new Contas();
		ContaDoPaulo.deposita(100);

		// associa o cliente paulo a conta do paulo
		ContaDoPaulo.titular = Paulo;
		System.out.println(ContaDoPaulo.titular.nome);
		System.out.println(ContaDoPaulo.titular);
		System.out.println(Paulo);
	}
}
