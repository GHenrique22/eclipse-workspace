
public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionarios g1 = new Gerentes();
		g1.setNome("Marcos");
		g1.setSalario(5000);
		
		Funcionarios e = new EditoresdeVideo();
		e.setSalario(2500);
		Funcionarios f = new Funcionarios();
		f.setSalario(2000);
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(e);
		System.out.println(controle.getSoma());
	}
}
