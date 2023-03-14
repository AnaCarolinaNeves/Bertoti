package observer;

public class Banda implements Observer {
	
	protected String nome;
	protected String nomeMusica;
	
	public Banda(String nome, String nomeMusica) {
		super();
		this.nome = nome;
		this.nomeMusica = nomeMusica;
	}

	@Override
	public void notification(String musica) {
		System.out.printf("A banda %s esta tocando a musica %s\n", nome, nomeMusica);
	}

}
