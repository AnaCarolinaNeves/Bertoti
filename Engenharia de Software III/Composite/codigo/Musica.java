package composite;

public class Musica implements BandaComponent {
	
	String nome;
	double duracaoMusica;
	
	public Musica(String nome, double duracaoMusica) {
		this.nome = nome;
		this.duracaoMusica = duracaoMusica;
	}

	@Override
	public void add(BandaComponent bandaComponent) {}

	@Override
	public String getNome() {
		return nome;
	}
	
	public double getDuracaoMusica() {
		return duracaoMusica;
	}

	@Override
	public void print() {
		System.out.print(" Musica: " + getNome());
		System.out.println(" Tempo da musica = " + getDuracaoMusica() + " minutos");
	}

}
