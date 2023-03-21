package composite;

public class Player {
	BandaComponent todasBandas;
	
	public Player(BandaComponent todasBandas) {
		this.todasBandas = todasBandas;
	}
	
	public void printBanda() {
		todasBandas.print();
	}
}
