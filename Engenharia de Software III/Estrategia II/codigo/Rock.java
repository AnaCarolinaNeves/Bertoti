package strategyII;

public class Rock extends Thread implements GeneroMusical {
	
	String playlist[] = { "Smell Like Teen Spirit", "Behind Blue Eyes", "Bohemian Rhapsody", "It's My Life", "Back in Black" };

	@Override
	public void escutarPlaylist() {
		// TODO Auto-generated method stub
		Thread threadRock = new Thread(this);
		threadRock.start();
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i] + " esta tocando!");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A playlist acabou!");
	}

}
