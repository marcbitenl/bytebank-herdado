
//Gerente herda da classe funcionario
public class Gerente extends Funcionario {
	 

	
	public Gerente() {
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonifacacao do Gerente");
		return super.getSalario();
	}
	
}