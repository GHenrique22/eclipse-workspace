
public class TesteConexao {

	public static void main(String[] args) {

		
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		}
		
	}	
		
}	
		
		
		//-------------------------
		
//		Conexao conn = null;
//
//		try {
//			conn = new Conexao();
//			conn.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o");
//
//		} finally {
//			System.out.println("finally");
//			if(conn != null) {
//			conn.close();
//			}
//		}
//
//	}

