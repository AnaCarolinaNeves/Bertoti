package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Banda implements BandaComponent {
	
	ArrayList bandaComponents = new ArrayList();
	String nome;
	String album;
	
	public Banda(String nome, String album) {
		this.nome = nome;
		this.album = album;
	}

	@Override
	public void add(BandaComponent bandaComponent) {
		bandaComponents.add(bandaComponent);
	}
	
	public BandaComponent getChild(int i) {
		return (BandaComponent)bandaComponents.get(i);
	}

	@Override
	public String getNome() {
		return nome;
	}
	
	public String getAlbum() {
		return album;
	}

	@Override
	public void print() {
		System.out.print("\nBanda " + getNome());
		System.out.println(" Album " + getAlbum());
		
		Iterator iterator = bandaComponents.iterator();
		while(iterator.hasNext()) {
			BandaComponent bandaComponent = (BandaComponent)iterator.next();
			bandaComponent.print();
		}
	}

}
