
//Gerente herda da classe funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifacacao doEditor de video");
		return super.getBonificacao() + 100;
	}
	
}