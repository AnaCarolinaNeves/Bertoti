package observer;

public class Teste {

	public static void main(String[] args) {
		Radio band = new Radio("Band");
		Radio nativa = new Radio("Nativa");
		
		Banda queen = new Banda("Queen", "Bohemian Rhapsody");
		Banda nirvana = new Banda("Nirvana", "Smell Like Teen Spirit");
		Banda bonJovi = new Banda("Bon Jovi", "It's My Life");
		Banda theWho = new Banda("The Who", "Behind Blue Eyes");
		
		band.colocarMusica(queen);
		band.colocarMusica(nirvana);
		band.colocarMusica(bonJovi);
		band.colocarMusica(theWho);
		
		nativa.colocarMusica(queen);
		nativa.colocarMusica(nirvana);
		nativa.colocarMusica(bonJovi);
		nativa.colocarMusica(theWho);
		
		band.musica("");
		nativa.musica("");
		band.trocarMusica(bonJovi);
		band.musica("");
	}

}
