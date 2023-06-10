package mvc;

import java.util.Timer;
import java.util.TimerTask;

public class Teste {

	public static void main(String[] args) {
		final Model model = Model.getInstance();
		ControllerTrial controller = new ControllerTrial(model);
		
		Model.playlist("Nirvana", "Smell Like Teen Spirit", "Nevermind", 5000);
		Model.playlist("Queen", "Bohemian Rhapsody", "A Night at the Opera", 10000);
		Model.playlist("Bon Jovi", "It's My Life", "Crush", 15000);
		
	}

}
