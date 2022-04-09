
public abstract class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.resgistra(g1);
		controle.resgistra(ev);
		
		System.out.println(g1.getBonificacao());
		
		System.out.println(ev.getBonificacao());
				
		
		
		

	}

}
