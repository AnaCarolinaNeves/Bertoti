package facade;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorDeMusica {
    private MusicaPlayer player;
    private List<Musica> playlist;
    private int currentIndex;

    public ReprodutorDeMusica(List<Musica> playlist) {
        this.player = new MusicaPlayer();
        this.playlist = playlist;
        this.currentIndex = 0;
    }

    public void play() {
        Musica musicaAtual = playlist.get(currentIndex);
        player.play(musicaAtual);
    }

    public void pause() {
        player.pause();
    }

    public void stop() {
        player.stop();
        currentIndex = 0;
    }

    public void nextTrack() {
        currentIndex++;
        if (currentIndex >= playlist.size()) {
            currentIndex = 0;
        }
        play();
    }

    public void prevTrack() {
        currentIndex--;
        if (currentIndex < 0) {
            currentIndex = playlist.size() - 1;
        }
        play();
    }
}
