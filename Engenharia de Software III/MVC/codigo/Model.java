package mvc;

import java.util.ArrayList;



import java.util.*;

public class Model implements Subject {
	private ArrayList observers;
	private String banda;
	private String nomeMusica;
	private String album;
	
	public Model() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(banda, nomeMusica, album);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setPlayer(String banda, String nomeMusica, String album) {
		this.banda = banda;
		this.nomeMusica = nomeMusica;
		this.album = album;
		measurementsChanged();
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
}
