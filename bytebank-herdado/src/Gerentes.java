
public class Gerentes extends Funcionarios {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do GERENTE");
		return super.getBonificacao() + super.getSalario();
	}

}
