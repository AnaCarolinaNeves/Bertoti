package mvc;

import java.util.Timer;
import java.util.TimerTask;

public class Teste {

	public static void main(String[] args) {
		final Model model = new Model();
		ControllerTrial controller = new ControllerTrial(model);
		
		
		final Timer timer = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setPlayer("Nirvana", "Smell Like Teen Spirit", "Nevermind");
	        }
	      }, 3000);
	      
	      final Timer timer2 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setPlayer("Queen", "Bohemian Rhapsody", "A Night at the Opera");
	        }
	      }, 8000);
	      
	      final Timer timer3 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setPlayer("Bon Jovi", "It's My Life", "Crush");
	        }
	      }, 13000);
		
	}

}
