
//Gerente herda da classe funcionario, assina o contrato autenticav�l, e um um autenticavel 
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifacacao do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}
}