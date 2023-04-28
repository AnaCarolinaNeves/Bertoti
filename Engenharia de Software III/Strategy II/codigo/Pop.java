package strategyII;

public class Pop extends Thread implements GeneroMusical {
	
	String playlist[] = { "Umbrella", "Run the World", "California Gurls", "Poker Face", "Viva La Vida" };

	@Override
	public void escutarPlaylist() {
		// TODO Auto-generated method stub
		Thread threadPop = new Thread(this);
		threadPop.start();
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
