
public abstract class Contas {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Contas(int agencia, int numero) {
		Contas.total++;
		// System.out.println(" o total de contas eh: " + Contas.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
		// this.saldo = 100;
		// System.out.println("estou criando uma conta" + this.numero);
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("saldo: " + this.saldo + " valor: " + valor);

		}

		this.saldo -= valor;
	}

	public void transfere(double valor, Contas destino) throws SaldoInsuficienteException {

		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("erro, nao pode valor <= 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Contas.total;
	}

}
