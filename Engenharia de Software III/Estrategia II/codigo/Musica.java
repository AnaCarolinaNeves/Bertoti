package strategyII;

public class Musica {
	private GeneroMusical generoMusical;
	public void setGenero (GeneroMusical musica) {
		generoMusical = musica;
	}
	
	public void tocarPlaylist() {
		generoMusical.escutarPlaylist();
	}
}
