package mvc;

import java.util.Timer;
import java.util.TimerTask;

public class ControllerTrial implements controllerInterface{

	View view;
	Subject model;
	
	public ControllerTrial(Subject mo){
		this.model = mo;
		view = new View(model, this);
		view.createView();
		view.desabilitarBotaoParar();
		
	}
	
	public void tocar(){
		
		model.registerObserver(view);
		System.out.println("Música tocando");
		view.desabilitarBotaoTocar();
		view.habilitarBotaoParar();	
		
		final Timer timerParar = new Timer();
		timerParar.schedule(new TimerTask() {
			public void run() {
				parar();
			}
		}, 20000);
	}
	
	public void parar(){
		
		model.removeObserver(view);
		System.out.println("Música parou");
		view.desabilitarBotaoParar();
		
	}
}
