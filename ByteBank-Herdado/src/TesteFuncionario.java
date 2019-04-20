
public class TesteFuncionario {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		Gerente nico = new Gerente();
		nico.setNome("Nico Stepool");
		nico.setCpf("22355646");
		nico.setSalario(2600.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

		// nico.salario = 3000.0;
	}

}
