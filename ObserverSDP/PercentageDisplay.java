import java.util.HashMap;
import java.util.Map;

/**
 * Displays the candidates and the percent of all the votes each owns.
 * @author David Eta
 * 
 */
public class PercentageDisplay implements Observer {
    
    Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();

    public PercentageDisplay(Subject poll)
    {
        this.poll = poll;
        poll.registerObserver(this);
    }
/**
     * Udates the hashmap with the new values and shows the data.
     * @param hash_map
     */
    public void update(HashMap<String, Integer> votes)
    {
        this.votes = votes;
        display();
    }

    /**
     * Prints out the candidates and the percent of votes they own.
     * @param none
     */
    private void display()
    {
        System.out.println("Current Percent of Votes:\n");
        int total = 0;
        
        for (Map.Entry<String, Integer> vote : votes.entrySet()) {
            total += vote.getValue();
        }
        for (Map.Entry<String, Integer> vote : votes.entrySet()) {
            double a = vote.getValue() * 100.0 / total;
            System.out.println(vote.getKey() + " : " + String.format("%.1f", a) + "%");
        }
        System.out.println();
    }

}
