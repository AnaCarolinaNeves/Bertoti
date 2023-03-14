package observer;

import java.util.ArrayList;
import java.util.List;

public class Radio implements Player {
	
	protected List<Observer> observers = new ArrayList<Observer>();	
	protected String nome;
	
	public Radio(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void musica(String musica) {
		System.out.printf("\nA radio %s esta tocando as bandas:\n", nome);
		tocandoMusica(musica);
	}

	@Override
	public synchronized void colocarMusica(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public synchronized void trocarMusica(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void tocandoMusica(String musica) {
		observers.forEach(observer -> observer.notification(musica));
	}

}
