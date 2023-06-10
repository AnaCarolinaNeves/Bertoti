package mvc;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Model implements Subject {
	private static Model instance;
	private ArrayList<Observer> observers;
	private String banda;
	private String nomeMusica;
	private String album;
	
	private Model() {
		observers = new ArrayList<>();
	}
	
	public static synchronized Model getInstance() {
		if(instance == null) {
			instance = new Model();
		}
		return instance;
	}
	
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}
	
	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(banda, nomeMusica, album);
		}
	}
	
	public void songChanged() {
		notifyObservers();
	}
	
	public void setPlayer(String banda, String nomeMusica, String album) {
		this.banda = banda;
		this.nomeMusica = nomeMusica;
		this.album = album;
		songChanged();
	}
	
	public String getBanda() {
		return banda;
	}
	
	public String getNomeMusica() {
		return nomeMusica;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public static void playlist(final String banda, final String nomeMusica, final String album, long delay) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				Model model = Model.getInstance();
				model.setPlayer(banda, nomeMusica, album);
			}
		}, delay);
	}
}
