package mvc;

public interface Subject {
    void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
//    void avancarMusica();
    void setPlayer(String banda, String nomeMusica, String album);
}
