
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero){
		Conta.total++;
		System.out.println("O total de contas �: " + total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Voce esta criando uma conta na agencia: " + this.agencia);
		
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque permitido");
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	public boolean transfere(double valor,Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	public double getSaldo(){
		return this.saldo;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("n�o pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}
