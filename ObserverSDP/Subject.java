
/**
 * Interface that parentss the parents the polls.
 * @author David Eta
 * 
 */
public interface Subject {
    
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
