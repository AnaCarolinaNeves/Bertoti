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
		System.out.println("Música tocando");
		view.desabilitarBotaoTocar();
		view.habilitarBotaoParar();
		
	}
	
	public void parar(){
		
		model.removeObserver(view);
		System.out.println("Música parou");
		view.desabilitarBotaoParar();
		view.habilitarBotaoTocar();
//		view.desabilitarBotaoAvancar();
		
	}
	
//	public void avancar() {
//		model.avancarMusica();
//		System.out.println("Próxima música");
//		view.habilitarBotaoAvancar();
//	}
	
}
