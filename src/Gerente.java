
//Gerente herda da classe funcionario
public class Gerente extends FuncionarioAutenticavel {
	 

	
	public Gerente() {
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifacacao do Gerente");
		return super.getBonificacao() + super.getSalario();
	}
	
}