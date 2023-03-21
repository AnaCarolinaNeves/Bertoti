package composite;

public class Teste {

	public static void main(String[] args) {
		BandaComponent nirvana = new Banda("Nirvana", "Nevermind");
		BandaComponent queen = new Banda("Queen", "A Night At The Opera");
		BandaComponent bonJovi = new Banda("Bon Jovi", "Slippery When Wet");
		
		BandaComponent todasBandas = new Banda("e","");
		
		todasBandas.add(nirvana);
		todasBandas.add(queen);
		todasBandas.add(bonJovi);
		
		nirvana.add(new Musica("Smells Like Teen Spirit", 5.01));
		nirvana.add(new Musica("Come As You Are", 3.39));
		nirvana.add(new Musica("Breed", 3.04));
		
		queen.add(new Musica("Bohemian Rhapsody", 5.54));
		queen.add(new Musica("Love Of My Life", 3.38));
		queen.add(new Musica("Sweet Lady", 4.02));
		
		bonJovi.add(new Musica("It's My Life", 3.45));
		bonJovi.add(new Musica("Say It Isn't So", 3.33));
		bonJovi.add(new Musica("One Wild Night", 4.43));
		
		Player player = new Player(todasBandas);
		player.printBanda();
		
	}

}
