package mvc;

public class Controller implements controllerInterface{

	View view;
	Subject model;
	
	public Controller(Subject mo){
		this.model = mo;
		view = new View(model, this);
		view.createView();
		view.desabilitarBotaoParar();
		
	}
	
	public void tocar(){
		
		model.registerObserver(view);
		System.out.println("M�sica tocando");
		view.desabilitarBotaoTocar();
		view.habilitarBotaoParar();
		
	}
	
	public void parar(){
		
		model.removeObserver(view);
		System.out.println("M�sica parou");
		view.desabilitarBotaoParar();
		view.habilitarBotaoTocar();
//		view.desabilitarBotaoAvancar();
		
	}
	
//	public void avancar() {
//		model.avancarMusica();
//		System.out.println("Pr�xima m�sica");
//		view.habilitarBotaoAvancar();
//	}
	
}
