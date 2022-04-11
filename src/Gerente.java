
//Gerente herda da classe funcionario, assina o contrato autenticavél, e um um autenticavel 
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public Gerente() {

	}

	public double getBonificacao() {
		System.out.println("Chamando o método de bonifacacao do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}