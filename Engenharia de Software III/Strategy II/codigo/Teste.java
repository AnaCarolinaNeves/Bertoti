package strategyII;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musica musica = new Musica();
		musica.setGenero(new Rock());
		musica.tocarPlaylist();
		musica.setGenero(new Pop());
		musica.tocarPlaylist();
	}

}
