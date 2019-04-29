
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta ContaDaMarcela = new Conta();
		System.out.println(ContaDaMarcela.getSaldo());
		
		ContaDaMarcela.titular = new Cliente();
		System.out.println(ContaDaMarcela.titular);
		
		ContaDaMarcela.titular.nome = "Marcela";
		System.out.println(ContaDaMarcela.titular.nome);
	}
}
