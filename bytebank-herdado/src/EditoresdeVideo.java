
public class EditoresdeVideo extends Funcionarios {


	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonifica��o do EDITOR");
		return super.getBonificacao() + 100;
	}

}
