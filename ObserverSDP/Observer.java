package ObserverSDP;

import java.util.HashMap;

/**
 * Interface that parents the tallying options.
 * @author David Eta
 * 
 */
public interface Observer {
    /**
     * Method that is implemented by children.
     * @param hashmap the candidates and their votes
     */
    public void update(HashMap<String, Integer> votes);

}
