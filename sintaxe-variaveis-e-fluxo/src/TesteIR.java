
public class TesteIR {
	public static void main(String[] args) {
		double salario = 5000.0;
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Voc� pode deduzir R$142 na declara��o");
		} else {
			if (salario > 2800.0 && salario <= 3750.0) {
				System.out.println("Voc� pode deduzir R$350 na declara��o");
			} else {
				if (salario > 3750.0) {
					System.out.println("Voc� pode deduzir R$636 na declara��o");
				}
			}
		}
	}
}
