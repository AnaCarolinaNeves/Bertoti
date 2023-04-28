package strategy;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musica musica = new Musica();
		musica.setGenero(new Rock());
		musica.tocarMusica();
		// musica.setGenero(new Pop());
		// musica.tocarMusica();
	}

}
