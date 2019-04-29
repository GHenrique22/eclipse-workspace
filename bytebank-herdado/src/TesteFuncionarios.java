
public class TesteFuncionarios {
	public static void main(String[] args) {

		Funcionarios nico = new Funcionarios();
		nico.setNome("Nico Steppat");
		nico.setCpf("332223444-70");
		nico.setSalario(2600.0);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
