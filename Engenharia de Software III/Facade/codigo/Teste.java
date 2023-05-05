package facade;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Musica queen = new Musica("Bohemian Rhapsody");
        Musica nirvana = new Musica("Smells Like Teen Spirit");
        Musica bonJovi = new Musica("It's My Life");

        List<Musica> playlist = new ArrayList<Musica>();
        playlist.add(queen);
        playlist.add(nirvana);
        playlist.add(bonJovi);

        ReprodutorDeMusica reprodutor = new ReprodutorDeMusica(playlist);

        reprodutor.play();
        reprodutor.nextTrack();
        reprodutor.prevTrack();
        reprodutor.prevTrack();
        reprodutor.pause();
        reprodutor.stop();
	}

}
