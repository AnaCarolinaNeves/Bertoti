package singleton;

public class Player {
	private static Player uniqueInstance;
	
	public static Player getInstance() {
		if(uniqueInstance == null) {
			System.out.println("Spotify esta tocando");
			uniqueInstance = new Player();
		}
		return uniqueInstance;
	}
}
