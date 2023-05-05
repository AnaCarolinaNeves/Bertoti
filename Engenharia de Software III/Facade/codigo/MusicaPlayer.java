package facade;

public class MusicaPlayer {
    public void play(Musica musica) {
        System.out.println("Tocando " + musica.getNome());
    }

    public void pause() {
        System.out.println("Pausando a música");
    }

    public void stop() {
        System.out.println("Parando a música");
    }
}
