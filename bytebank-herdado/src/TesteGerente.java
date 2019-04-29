
public class TesteGerente {
	public static void main(String[] args) {
		Gerentes g1 = new Gerentes();
		g1.setNome("Gustavo");
		g1.setCpf("33200043332");
		g1.setSalario(5000);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());

		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());

	}
}
