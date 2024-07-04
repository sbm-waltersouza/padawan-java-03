
public class TesteReferencia {

	public static void main(String[] args) {
	
		Funcionario g1 = new Gerente();
		Object objeto = g1;
		if(objeto instanceof String) {
			System.out.println("entrou no if");
		}
		g1.setNome("walter");
		String nome = g1.getNome();
		
		System.out.println(nome);
	}

}
