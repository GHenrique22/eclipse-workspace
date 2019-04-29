
public class EditoresdeVideo extends Funcionarios {


	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do EDITOR");
		return super.getBonificacao() + 100;
	}

}
