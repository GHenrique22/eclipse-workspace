
public class ControleBonificacao {
	private double soma;
	
public void registra(Funcionarios g) {
		double boni = g.getBonificacao();
		this.soma = this.soma + boni;
	}

	public double getSoma() {
		return soma;
	}
}
